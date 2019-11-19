package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setName("Griffin");
		this.setNrOfLegs(6);
	}

}
