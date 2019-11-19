package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {

	public Octopus(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setAvgSwimDepth(10);
		this.setName("Octo");
		this.setNrOfLegs(10);
		this.setWaterType(Enum.salt_water);
	}

}
