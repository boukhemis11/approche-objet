package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
		int result = pays1.getPays().compareTo(pays2.getPays());
		return result;
	}

}
