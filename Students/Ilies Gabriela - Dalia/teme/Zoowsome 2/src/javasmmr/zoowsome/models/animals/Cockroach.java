package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setCanFly(false);
		this.setIsDangerous(true);
		this.setNrOfLegs(6);
		this.setName("Pleaca");
	}
}
