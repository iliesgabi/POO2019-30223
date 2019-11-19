package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setAvgSwimDepth(40);
		this.setName("Florin");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.salt_water);
	}

}
