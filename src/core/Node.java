package core;

import java.util.HashSet;
import java.util.Set;

public class Node<T> implements Comparable<Node<T>> {

	T devotion;
	String pathAnnotiation;
	Node<T> parent;
	Set<Node<T>> children;
	private double costFromStart, heuristicCost;

	public Node(T devotion) {
		this.devotion = devotion;
		this.children = new HashSet<Node<T>>();
		this.costFromStart = 0.0;
		this.heuristicCost = Double.MAX_VALUE;
	}

	public boolean isRoot() {
		return (parent == null);
	}

	public T getValue() {
		return devotion;
	}

	public Node<T> getParent() {
		return parent;
	}

	public Set<Node<T>> getChildren() {
		return children;
	}

	public String getPathAnnotation() {
		return pathAnnotiation;
	}

	public double getCostFromStart() {
		return costFromStart;
	}

	public double getCostTo(Node<Devotion> neighbor) {
		return 1.0;
	}

	public double getHeuristicCost() {
		return heuristicCost;
	}

	public void setHeuristicCost(double heuristicCost) {
		this.heuristicCost = heuristicCost;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}

	public void setCostFromStart(double costFromStart) {
		this.costFromStart = costFromStart;
	}

	public void setPathAnnotation(String pathAnnotation) {
		this.pathAnnotiation = pathAnnotation;
	}

	@Override
	public int hashCode() {
		return devotion.hashCode();
	}

	@Override
	public int compareTo(Node<T> o) {
		return Double.compare(heuristicCost, o.getHeuristicCost());
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Node<?>)) {
			return false;
		}

		Node<?> otherNode = (Node<?>) obj;

		return this.getValue().equals(otherNode.getValue());
	}
}
