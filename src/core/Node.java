package core;

import java.util.HashSet;
import java.util.Set;

public class Node<T> {

	T devotion;
	String pathAnnotiation;
	Node<T> parent;
	Set<Node<T>> children;

	public Node(T devotion, String pathAnnotation) {
		this.devotion = devotion;
		this.pathAnnotiation = pathAnnotation;
		this.children = new HashSet<Node<T>>();
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
	
	@Override
	public int hashCode() {
		return devotion.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		return devotion.equals(o);
	}

}
