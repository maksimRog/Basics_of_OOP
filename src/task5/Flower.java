package task5;

public class Flower {
	public static final Flower ROSE = new Flower("Rose", 100);
	public static final Flower TULIP = new Flower("Tulip", 80);
	public static final Flower CLOVE = new Flower("Clove", 80);

	private String name;
	private int cost;

	@Override
	public String toString() {
		return name.toUpperCase();
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Flower(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

}
