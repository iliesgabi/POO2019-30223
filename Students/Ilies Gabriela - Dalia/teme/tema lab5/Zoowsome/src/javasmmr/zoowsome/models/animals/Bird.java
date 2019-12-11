package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private boolean migrates;
	private Integer avgFlightAltitude;

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public boolean getMigrates() {
		return this.migrates;
	}

	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
}
