package javasmmr.zoowsome.models.animals;

public class WhiteStork extends Bird {
	public WhiteStork(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setAvgFlightAltitude(4800);
		this.setMigrates(true);
		this.setName("Ciconia");
		this.setNrOfLegs(2);
	}

}
