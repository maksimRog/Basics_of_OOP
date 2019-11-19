package task5;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposition {
	private String packageOf;
	private List<Flower> flowers;

	public FlowerComposition() {
		super();
		this.flowers = new ArrayList<>();
	}

	public void addFlower(Flower flower) {
		flowers.add(flower);
	}

	public String getPackageOf() {
		return packageOf;
	}

	public void setPackageOf(String packageOf) {
		this.packageOf = packageOf;
	}

	public void print() {
		int cost = 0;
		System.out.print("Упаковка:" + packageOf + " Цветы: ");
		for (Flower flower : flowers) {
			cost = cost + flower.getCost();
			System.out.print(flower + " ");
		}
		System.out.println("Цена композиции: " + cost);

	}

}
