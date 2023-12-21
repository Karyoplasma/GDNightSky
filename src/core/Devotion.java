package core;

import java.util.Arrays;

import core.enums.Constellation;

public class Devotion {

	private boolean[] constellations;
	private int[] affinity;
	private int pointsRemaining;

	public Devotion(boolean[] constellations, int[] affinity, int remainingPoints) {
		this.constellations = constellations;
		this.affinity = affinity;
		this.pointsRemaining = remainingPoints;
	}

	public Devotion(Devotion devotion) {
		this.constellations = Arrays.copyOf(devotion.constellations, devotion.constellations.length);
		this.affinity = Arrays.copyOf(devotion.affinity, devotion.affinity.length);
		this.pointsRemaining = devotion.pointsRemaining;
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

	public boolean canUnassign(Constellation constellation) {
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

	private boolean isAssigned(Constellation constellation) {
		return constellations[constellation.ordinal()];
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

	public static void main(String[] args) {
		// lol syso testing, too tired to write unit tests
		Devotion d = new Devotion(new boolean[Constellation.values().length], new int[5], 55);
		d.assign(Constellation.ORDER_CROSSROADS);
		d.assign(Constellation.TORTOISE);
		d.assign(Constellation.TSUNAMI);
		System.out.println("points remaining (44): " + d.pointsRemaining);
		System.out.println("Affinity original (0,0,0,3,8): " + Arrays.toString(d.affinity));
		Devotion dc = new Devotion(d);
		System.out.println("equals after cloning: " + d.equals(dc));
		System.out.println("original can unassign turtle (true): " + d.canUnassign(Constellation.TORTOISE));
		System.out.println("original can unassign tsunami (true): " + d.canUnassign(Constellation.TSUNAMI));
		System.out.println("equals after checks: " + d.equals(dc));
		dc.unassign(Constellation.TSUNAMI);
		System.out.println("equals after removing tsunami(clone): " + d.equals(dc));
		System.out.println("Affinity clone (0,0,0,3,3): " + Arrays.toString(dc.affinity));
		System.out.println("points remaining (49): " + dc.pointsRemaining);
		d.assign(Constellation.LION);
		d.assign(Constellation.TARGO_THE_BUILDER);
		System.out.println(
				"Original can assign azrakaa (false): " + d.canAssign(Constellation.AZRAKAA_THE_ETERNAL_SANDS));
		System.out.println("points remaining (34): " + d.pointsRemaining);
		System.out.println("Affinity original (0,0,0,7,8): " + Arrays.toString(d.affinity));
		System.out.println("original can unassign targo (TRUE): " + d.canUnassign(Constellation.TARGO_THE_BUILDER));
		d.unassign(Constellation.LION);
		System.out.println("original can unassign targo (FALSE): " + d.canUnassign(Constellation.TARGO_THE_BUILDER));

	}
}
