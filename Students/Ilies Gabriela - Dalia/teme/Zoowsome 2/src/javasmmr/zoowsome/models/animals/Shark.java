package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setAvgSwimDepth(100);
		this.setName("Fugi");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.salt_water);
	}
}
