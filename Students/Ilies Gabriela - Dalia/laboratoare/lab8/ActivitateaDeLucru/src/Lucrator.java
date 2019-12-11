
public class Lucrator {
	private String nume;
	private CalendarLucru calendarLucru;

	public Lucrator(String nume, CalendarLucru calendarLucru) {
		this.nume = nume;
		this.calendarLucru = calendarLucru;
	}

	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		Zi[] zile = calendarLucru.getZi();
		boolean ok1 = false;
		boolean ok2 = false;
		for (int i = 0; i < zile.length; i++) {
			if (zile[i].getZiDinSaptamana().equals(zi)) {
				ok2 = true;
				if (zile[i].isZiLucratoare() == true) {
					System.out.println("este zi lucratoare");
					ok1 = true;
					break;
				}
			}
		}
		if (ok2 == false)
			System.out.println(zi+" nu este o zi a saptamanii ");
		if (ok1 == false) {
			throw new ExceptieZiNelucratoare();
		}

	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public CalendarLucru getCalendarLucru() {
		return calendarLucru;
	}

	public void setCalendarLucru(CalendarLucru calendarLucru) {
		this.calendarLucru = calendarLucru;
	}

}
