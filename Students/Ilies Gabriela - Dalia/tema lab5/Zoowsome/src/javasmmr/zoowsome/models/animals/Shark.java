package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark() {
		this.setAvgSwimDepth(100);
		this.setName("Fugi");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.salt_water);
	}
}
