
public class MainClass {
	public static void main(String argv[]) {
		Zi[] zile = new Zi[7];
		zile[0] = new Zi("luni", true);
		zile[1] = new Zi("marti", true);
		zile[2] = new Zi("miercuri", true);
		zile[3] = new Zi("joi", true);
		zile[4] = new Zi("vineri", true);
		zile[5] = new Zi("sambata", false);
		zile[6] = new Zi("duminica", false);

		CalendarLucru calendarLucru = new CalendarLucru(zile);
		Lucrator lucrator = new Lucrator("Cezar", calendarLucru);
		try {
			lucrator.lucreaza("luni");
			lucrator.lucreaza("marti");
			lucrator.lucreaza("marte");
			lucrator.lucreaza("sambata");
			lucrator.lucreaza("duminica");
		} catch (ExceptieZiNelucratoare e) {
			e.getMessage();
			e.printStackTrace();
		}

	}
}
