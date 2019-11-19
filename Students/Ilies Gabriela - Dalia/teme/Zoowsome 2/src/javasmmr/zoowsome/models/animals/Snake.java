package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setLaysEggs(true);
		this.setNrOfLegs(0);
		this.setName("Cobra");
	}
}
