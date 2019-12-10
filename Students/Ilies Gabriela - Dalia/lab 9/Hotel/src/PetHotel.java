import java.util.ArrayList;
import java.util.List;

public class PetHotel {
	private List<Pet> animale;
	private String numeHotel;

	public PetHotel(String numeHotel) {
		this.numeHotel=numeHotel;
		this.animale=new ArrayList<Pet>();
	}

	public List<Pet> getAnimale() {
		return animale;
	}

	public void setAnimale(List<Pet> animale) {
		this.animale = animale;
	}

	public String getNumeHotel() {
		return numeHotel;
	}

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}

	public void adaugaPet(Pet animal) {
		this.animale.add(animal);
	}
	
	public void stergePet(Pet animal) {
		if (this.animale.isEmpty() == true) {
			System.out.println("nu exista nici un animal in hotel");
		} else {
			if (this.animale.contains(animal) == true) {
				this.animale.remove(animal);
			} else {
				System.out.println("nu exista acest animal in hotel");
			}
		}
	}
}
