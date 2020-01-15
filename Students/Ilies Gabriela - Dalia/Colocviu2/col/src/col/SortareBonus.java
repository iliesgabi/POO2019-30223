package col;

import java.util.Comparator;

public class SortareBonus implements Comparator<AngajatFarmacie>{

	@Override
	public int compare(AngajatFarmacie angajat1, AngajatFarmacie angajat2) {
			if (angajat1.getBonus()>angajat2.getBonus())
				return 1;
			if (angajat1.getBonus()<angajat2.getBonus())
				return -1;
		return 0;
	}
}
