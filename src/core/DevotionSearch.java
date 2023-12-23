package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import core.enums.Constellation;

public class DevotionSearch {

	public static Node<Devotion> aStarSearch(Node<Devotion> start, Node<Devotion> goal) {
		PriorityQueue<Node<Devotion>> openSet = new PriorityQueue<Node<Devotion>>();
		HashSet<Node<Devotion>> closedSet = new HashSet<Node<Devotion>>();
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
					neighbor.setHeuristicCost(estimateCostToGoal(neighbor, goal));
					neighbor.setParent(current);
					openSet.add(neighbor);
				}
			}
		}

		return null;
	}

	private static double estimateCostToGoal(Node<Devotion> currentNode, Node<Devotion> goalNode) {
		Devotion current = currentNode.getValue();
		Devotion goal = goalNode.getValue();
		int missingDevotion = 0;
		int wrongDevotion = 0;
		int correctDevotion = 0;

		for (Constellation c : Constellation.values()) {
			if (goal.isAssigned(c)) {
				if (current.isAssigned(c)) {
					correctDevotion++;
				} else {
					missingDevotion++;
				}
			} else {
				if (current.isAssigned(c)) {
					wrongDevotion++;
				}
			}
		}
		double weightMissing = 1.5;
		double weightWrong = 2.5;
		double weightCorrect = (correctDevotion == 0) ? 0.25 : correctDevotion;

		double heuristicValue = (weightMissing * missingDevotion + weightWrong * wrongDevotion) / weightCorrect;

		return heuristicValue;
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
