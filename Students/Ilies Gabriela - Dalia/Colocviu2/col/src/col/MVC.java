package col;

public class MVC {
	
	public static void main(String[] args) { 
		Farmacie farmacie= new Farmacie("Ceva","adresa","07","site");
		View view= new View(farmacie);
		new Controller(farmacie,view);
	}
}
