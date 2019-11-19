package javasmmr.zoowsome.models.animals;

public class Dog extends Mammal {

	public Dog(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setName("Scooby Doo");
		this.setNormalBodyTemp(30);
		this.setNrOfLegs(4);
		this.setPercBodyHair(95);
	}

}
