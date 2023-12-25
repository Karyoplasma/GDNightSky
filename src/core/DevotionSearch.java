package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

import core.enums.Constellation;

public class DevotionSearch {
	private static HashSet<Constellation> activeConstellations = new HashSet<Constellation>();

	public static Node<Devotion> aStarSearch(Node<Devotion> start, Node<Devotion> goal, boolean prioritizeActives) {
		PriorityQueue<Node<Devotion>> openSet = new PriorityQueue<Node<Devotion>>();
		HashSet<Node<Devotion>> closedSet = new HashSet<Node<Devotion>>();

		if (prioritizeActives) {
			for (Constellation c : Constellation.values()) {
				if (c.hasActive() && goal.getValue().isAssigned(c) && c.getTier() < 3) {
					activeConstellations.add(c);
				}
			}
		}
		openSet.add(start);

		while (!openSet.isEmpty()) {
			Node<Devotion> current = openSet.poll();

			if (current.equals(goal)) {
				return current;
			}

			closedSet.add(current);
			for (Node<Devotion> neighbor : current.getValue().spawnChildren()) {
				if (closedSet.contains(neighbor)) {
					continue;
				}

				double tentativeCost = current.getCostFromStart() + current.getCostTo(neighbor);

				if (!openSet.contains(neighbor) || tentativeCost < neighbor.getCostFromStart()) {
					neighbor.setCostFromStart(tentativeCost);
					neighbor.setHeuristicCost(estimateCostToGoal(neighbor, goal, prioritizeActives));
					neighbor.setParent(current);
					openSet.add(neighbor);
				}
			}
		}

		return null;

	}

	private static double estimateCostToGoal(Node<Devotion> currentNode, Node<Devotion> goalNode,
			boolean prioritizeActives) {
		Devotion current = currentNode.getValue();
		Devotion goal = goalNode.getValue();
		int missingDevotion = 0;
		int wrongDevotion = 0;
		int correctDevotion = 0;

		for (Constellation c : Constellation.values()) {
			if (goal.isAssigned(c)) {
				if (current.isAssigned(c)) {
					if (prioritizeActives && c.getTier() == 0) {
						int t1ActivesMissing = 0;
						for (Constellation con : activeConstellations) {
							if (!current.isAssigned(con) && con.getTier() == 1) {
								t1ActivesMissing++;
							}
						}
						if (t1ActivesMissing == 0) {
							correctDevotion++;
						}
					} else {
						correctDevotion++;
					}

				} else {
					// the higher tier the missing devotion is the lower the punishment
					// this should guide the search towards preferring to take low tier
					// constellations to meet requirements

					missingDevotion += 4 - c.getTier();
					if (c.hasActive() && prioritizeActives) {
						missingDevotion += 4 * (4 - c.getTier());
					}
				}
			} else {
				if (current.isAssigned(c)) {
					// wrong devotings should be punished by how big the mistake is
					// taking chariot of the dead for 7 points because it gives 2 affinity or so
					// is bad and should be avoided. If actives are preferred, give a bonus if the
					// wrong constellation gives a relevant affinity bonus
					if (prioritizeActives) {
						int activesServed = 0;

						for (Constellation x : activeConstellations) {
							for (int i = 0; i < 5; i++) {
								if (c.getAffinityBonus()[i] > 0 && x.getRequiredAffinity()[i] > 0
										&& !current.isAssigned(x)) {
									activesServed++;
									break;
								}
							}
						}
						wrongDevotion += (2 * c.getPointsRequired()) - activesServed;
					} else {
						wrongDevotion += c.getPointsRequired();
					}
				}
			}
		}
		// weights are guesswork, might change in the future
		double weightMissing = 0.75;
		double weightWrong = 2.0;
		double weightedCorrect = (correctDevotion == 0) ? 0.5 : correctDevotion;
		// weightCorrect needs to be adjusted or else setups that don't have a crossroad
		// will have no guidance.

		double heuristicValue = (weightMissing * missingDevotion + weightWrong * wrongDevotion) / weightedCorrect;
		return Math.log(heuristicValue);
	}

	public static String reconstructPath(Node<Devotion> result) {
		List<Node<Devotion>> path = new ArrayList<Node<Devotion>>();
		StringBuffer buffer = new StringBuffer();
		while (!result.isRoot()) {
			path.add(result);
			result = result.getParent();
		}
		Collections.reverse(path);
		for (Node<Devotion> pathNode : path) {
			buffer.append(pathNode.getPathAnnotation()).append(System.getProperty("line.separator"));
		}
		return buffer.toString();
	}
}
