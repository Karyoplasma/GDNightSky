package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

import core.enums.Affinity;
import core.enums.Constellation;

public class DevotionSearch {

	public static Node<Devotion> aStarSearch(Node<Devotion> start, Node<Devotion> goal) {
		PriorityQueue<Node<Devotion>> openSet = new PriorityQueue<Node<Devotion>>();
		HashSet<Node<Devotion>> closedSet = new HashSet<Node<Devotion>>();
		openSet.add(start);
		int count = 0;
		int i = 1;
		while (!openSet.isEmpty()) {
			count++;
			
			Node<Devotion> current = openSet.poll();
			if ((count % 200) == 0) {
				System.out.println(String.format("%d nodes searched.\n%d nodes on ignore.\n%d to go.\n%.4f current cost.", i*100, closedSet.size(), openSet.size(), current.getHeuristicCost()));
				i++;
				System.out.println(reconstructPath(current));
				
			}
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

		return null; // No path found
	}

	// this is so fucking wrong wtf
	// test should be worse because it takes an unnecessary devotion
	// fix this!!
	private static double estimateCostToGoal(Node<Devotion> currentNode, Node<Devotion> goalNode) {
		if (currentNode.equals(goalNode)) {
			return 0.0;
		}
		Devotion current = currentNode.getValue();
		Devotion goal = goalNode.getValue();
		double achievedDevotions = 1.0;
		double achievedAffinity = 1.0;
		double punishmentWrongAffinity = 1.5;
		double punishmentImbalancedAffinity = 0.75;

		for (Constellation c : Constellation.values()) {
			int tier = c.getTier();
			if (current.isAssigned(c) && !goal.isAssigned(c)) {
				if (tier == 0) {
					achievedDevotions -= 0.25;
				} else {
					achievedDevotions += tier * 0.75;
				}
			}
			if (current.isAssigned(c) && goal.isAssigned(c)) {
				if (tier == 0) {
					achievedDevotions += 0.25;
				} else {
					achievedDevotions += tier * 0.25;
				}
			}
		}

		for (Affinity affinity : Affinity.values()) {
			if (goal.getAffinity(affinity) == 0) {
				achievedAffinity += current.getAffinity(affinity) * punishmentWrongAffinity;
			} else {
				achievedAffinity += Math.abs(current.getAffinity(affinity) - goal.getAffinity(affinity))
						* punishmentImbalancedAffinity;
			}
		}
		return achievedAffinity / achievedDevotions;
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
	
	public static void main(String[] args) {
		Devotion goal = new Devotion();
		Devotion start = new Devotion();
		goal.assign(Constellation.TORTOISE);
		goal.assign(Constellation.LION);
		goal.assign(Constellation.TSUNAMI);
		goal.assign(Constellation.TARGO_THE_BUILDER);
		goal.assign(Constellation.ULO_THE_KEEPER_OF_THE_WATERS);
		goal.assign(Constellation.STAG);
		goal.assign(Constellation.LIZARD);
		goal.assign(Constellation.ISHTAK_THE_SPRING_MAIDEN);
		//help
		start.assign(Constellation.TORTOISE);
		start.assign(Constellation.LION);
//		start.assign(Constellation.WRAITH);
		start.assign(Constellation.TSUNAMI);
		start.assign(Constellation.TARGO_THE_BUILDER);
		start.assign(Constellation.ULO_THE_KEEPER_OF_THE_WATERS);
		start.assign(Constellation.STAG);
		start.assign(Constellation.LIZARD);
//		start.assign(Constellation.LIGHT_OF_EMPYRION);
//		start.assign(Constellation.ISHTAK_THE_SPRING_MAIDEN);
		Devotion test = new Devotion(start);
		test.assign(Constellation.LIGHT_OF_EMPYRION);
		Node<Devotion> testNode = new Node<Devotion>(test, "");	
		Node<Devotion> startNode = new Node<Devotion>(start, "Start");
		Node<Devotion> goalNode = new Node<Devotion>(goal, "Goal");
		System.out.println(startNode.equals(goalNode));
		startNode.setHeuristicCost(estimateCostToGoal(startNode, goalNode));
		testNode.setHeuristicCost(estimateCostToGoal(testNode, goalNode));
		goalNode.setHeuristicCost(estimateCostToGoal(goalNode, goalNode));
		System.out.println("Heuristic cost (start -> goal): " + startNode.getHeuristicCost());
		System.out.println("Heuristic cost (test -> goal): " + goalNode.getHeuristicCost());
		System.out.println("Heuristic cost (goal -> goal): " + goalNode.getHeuristicCost());
		System.out.println("start.compareTo(test): " + startNode.compareTo(testNode));
		System.out.println("test.compareTo(goal): " + testNode.compareTo(goalNode));
//		System.out.println("Searching for:");
//		System.out.println(String.format("%s, remaining: %d", Arrays.toString(goal.getAffinity()), goal.getPointsRemaining()));
//		Node<Devotion> result = aStarSearch(startNode, goalNode);
//		System.out.println("-------------FOUND-----------------");
//		System.out.println(reconstructPath(result));
		
	}
}
