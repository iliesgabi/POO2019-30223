package javasmmr.zoowsome.models.animals;

public class Duck extends Bird {
	public Duck(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setAvgFlightAltitude(5);
		this.setMigrates(true);
		this.setName("Gratiela");
		this.setNrOfLegs(2);
	}

}
