package comparator;

import java.util.Comparator;

import core.enums.Constellation;

public class ConstellationTreeComparator implements Comparator<Constellation> {

	@Override
	public int compare(Constellation o1, Constellation o2) {
		return o1.toString().compareTo(o2.toString());
	}

}
