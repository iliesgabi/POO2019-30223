package javasmmr.zoowsome.models.animals;

public class Cat extends Mammal {
	public Cat(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("Garfield");
		this.setNormalBodyTemp(35);
		this.setNrOfLegs(4);
		this.setPercBodyHair(90);
	}
}
