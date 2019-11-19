package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {
	private final double maintenanceCost;
	private final double dangerPerc;
	private Integer nrOfLegs;
	private String name;
	private boolean takenCareOf;

	public Animal(double maintenanceCost, double dangerPerc)
	{
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean kill() {
		Random r = new Random();
		double random = r.nextDouble();
		if (random < dangerPerc) {
			return true;
		} else
			return false;
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}
}
