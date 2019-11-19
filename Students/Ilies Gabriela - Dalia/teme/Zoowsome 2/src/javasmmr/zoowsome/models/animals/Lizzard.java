package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile {
	public Lizzard(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setLaysEggs(true);
		this.setName("Lizi");
		this.setNrOfLegs(4);
	}
}
