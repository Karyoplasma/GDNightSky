package core;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

	T devotion;
	String pathAnnotiation;
	Node<T> parent;
	List<Node<T>> children;

	public Node(T devotion, String pathAnnotation) {
		this.devotion = devotion;
		this.pathAnnotiation = pathAnnotation;
		this.children = new ArrayList<Node<T>>();
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

	public List<Node<T>> getChildren() {
		return children;
	}

	public String getPathAnnotation() {
		return pathAnnotiation;
	}

	@Override
	public boolean equals(Object o) {
		return devotion.equals(o);
	}

}
