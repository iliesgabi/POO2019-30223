package javasmmr.zoowsome.models.animals;

enum Enum {
	fresh_water, salt_water
}

public abstract class Aquatic extends Animal {
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private Integer avgSwimDepth;
	private Enum waterType;

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Enum getWaterType() {
		return waterType;
	}

	public void setWaterType(Enum waterType) {
		this.waterType = waterType;
	}

}
