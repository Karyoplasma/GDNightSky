package core;

import java.util.HashSet;
import java.util.PriorityQueue;

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

	        return null; // No path found
	    }

	    private static double estimateCostToGoal(Node<Devotion> node, Node<Devotion> goal) {
	        
	        return DevotionEvaluator.estimateCost(node.getValue(), goal.getValue());
	    }
	    
}
