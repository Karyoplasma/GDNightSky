package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import core.enums.Affinity;
import core.enums.Constellation;

public class Devotion {

	private boolean[] constellations;
	private int[] affinity;
	private int pointsRemaining;

	public Devotion() {
		this.constellations = new boolean[Constellation.values().length];
		this.affinity = new int[5];
		this.pointsRemaining = 55;
	}

	public Devotion(Devotion devotion) {
		this.constellations = Arrays.copyOf(devotion.constellations, devotion.constellations.length);
		this.affinity = Arrays.copyOf(devotion.affinity, 5);
		this.pointsRemaining = devotion.pointsRemaining;
	}

	public Set<Node<Devotion>> spawnChildren() {
		Set<Node<Devotion>> children = new HashSet<Node<Devotion>>();
		for (Constellation constellation : Constellation.values()) {
			Devotion assignChild = this.spawnWithAssign(constellation);
			Devotion unassignChild = this.spawnWithUnassign(constellation);

			if (assignChild != null) {
				Node<Devotion> child = new Node<Devotion>(assignChild);
				child.setPathAnnotation(String.format("+ %s", constellation.toString()));
				children.add(child);
			}

			if (unassignChild != null) {
				Node<Devotion> child = new Node<Devotion>(unassignChild);
				child.setPathAnnotation(String.format("- %s", constellation.toString()));
				children.add(child);
				// swap logic not used because of side effects
//				for (Constellation swap : Constellation.values()) {
//					if (swap == constellation) {
//						continue;
//					}
//					
//					Devotion swapChild = unassignChild.spawnWithAssign(swap);
//					if (swapChild != null) {
//						String pathString = String.format("- %s%s+ %s", constellation.toString(),
//								System.getProperty("line.separator"), swap.toString());
//						Node<Devotion> child = new Node<Devotion>(swapChild, pathString);
//						children.add(child);
//					}
//				}
			}
		}
		return children;
	}

	public Devotion spawnWithAssign(Constellation constellation) {
		if (!canAssign(constellation)) {
			return null;
		}
		Devotion spawn = new Devotion(this);
		spawn.assign(constellation);
		return spawn;
	}

	public Devotion spawnWithUnassign(Constellation constellation) {
		if (!canUnassign(constellation)) {
			return null;
		}
		Devotion spawn = new Devotion(this);
		spawn.unassign(constellation);
		return spawn;
	}

	public boolean canAssign(Constellation constellation) {
		if (this.isAssigned(constellation)) {
			return false;
		}

		if (pointsRemaining < constellation.getPointsRequired()) {
			return false;
		}

		for (int i = 0; i < 5; i++) {
			if (affinity[i] < constellation.getRequiredAffinity()[i]) {
				return false;
			}
		}

		return true;
	}

	private boolean canUnassign(Constellation constellation) {
		if (!this.isAssigned(constellation)) {
			return false;
		}

		// how would the affinity look like if we unassign
		int[] newAffinity = Arrays.copyOf(affinity, 5);
		for (int k = 0; k < 5; k++) {
			newAffinity[k] -= constellation.getAffinityBonus()[k];
		}

		// check every assigned constellation whether it would still meet the
		// requirements with the new affinity
		for (int i = 0; i < constellations.length; i++) {
			if (constellations[i]) {
				for (int j = 0; j < 5; j++) {
					if (newAffinity[j] < Constellation.values()[i].getRequiredAffinity()[j]) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public void assign(Constellation constellation) {
		pointsRemaining -= constellation.getPointsRequired();
		constellations[constellation.ordinal()] = true;
		for (int i = 0; i < 5; i++) {
			affinity[i] += constellation.getAffinityBonus()[i];
		}
	}

	public void unassign(Constellation constellation) {
		pointsRemaining += constellation.getPointsRequired();
		constellations[constellation.ordinal()] = false;
		for (int i = 0; i < 5; i++) {
			affinity[i] -= constellation.getAffinityBonus()[i];
		}
	}

	public boolean isAssigned(Constellation constellation) {
		return constellations[constellation.ordinal()];
	}

	public List<Constellation> getIllegalConstellations() {
		List<Constellation> ret = new ArrayList<Constellation>();
		for (Constellation constellation : Constellation.values()) {
			if (this.isAssigned(constellation)) {
				for (int i = 0; i < 5; i++) {
					if (affinity[i] < constellation.getRequiredAffinity()[i]) {
						ret.add(constellation);
						break;
					}
				}
			}
		}
		return ret;
	}

	public int[] getAffinity() {
		return affinity;
	}

	public int getAffinity(Affinity affinity) {
		return this.affinity[affinity.ordinal()];
	}

	public int getPointsRemaining() {
		return pointsRemaining;
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(constellations);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Devotion)) {
			return false;
		}
		Devotion other = (Devotion) o;
		return Arrays.equals(constellations, other.constellations);
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("[");
		for (int i = 0; i < constellations.length; i++) {
			if (constellations[i]) {
				buffer.append(Constellation.values()[i].toString());
				buffer.append(", ");
			}

		}
		buffer.setLength((buffer.length() - 2) < 0 ? 1 : buffer.length() - 2);
		buffer.append("]");
		return buffer.toString();
	}
}
