package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setName("Marcel");
		this.setNormalBodyTemp(40);
		this.setNrOfLegs(4);
		this.setPercBodyHair(100);
	}
}
