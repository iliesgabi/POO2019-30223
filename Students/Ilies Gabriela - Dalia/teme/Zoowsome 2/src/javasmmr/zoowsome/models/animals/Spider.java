package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setCanFly(false);
		this.setIsDangerous(true);
		this.setNrOfLegs(8);
		this.setName("Vasile");
	}

}
