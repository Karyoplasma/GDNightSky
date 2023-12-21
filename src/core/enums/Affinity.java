package core.enums;

public enum Affinity {
	ASCENDANT,
	CHAOS,
	ELDRITCH,
	ORDER,
	PRIMORDIAL;

	private Affinity() {

	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(name().charAt(0));
		buffer.append(name().substring(1).toLowerCase());
		return buffer.toString();
	}

}
