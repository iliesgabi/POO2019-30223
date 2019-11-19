package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setLaysEggs(true);
		this.setName("Velma");
		this.setNrOfLegs(4);
	}
}
