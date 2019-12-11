
public class Receptie {
	public static void main(String argv[]) {
		Pet caine=new Pet("Maya",4,"Diana");
		Pet pisica=new Pet("Rumbu",3,"Andreea");
		Pet papagal= new Pet("Rio",2,"Daniel");
		
		PetHotel hotel=new PetHotel("Henlo Fren");
		hotel.adaugaPet(caine);
		hotel.adaugaPet(pisica);
		hotel.adaugaPet(papagal);
		for(Pet pet: hotel.getAnimale()) {
			System.out.println(pet.toString());
		}
		
		hotel.stergePet(papagal);
		hotel.stergePet(papagal);
		
		for(Pet pet: hotel.getAnimale()) {
			System.out.println(pet.toString());
		}
	}
}
