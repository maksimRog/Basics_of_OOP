package task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
private List<Product> products;
private int numberOfPayment;
private static int counter=0;

	public Payment() {
	super();
	counter++;
	this.numberOfPayment=counter;;
	this.products = new ArrayList<Product>();
}

	public  void buyProduct(String name, int cost){
		products.add(new Product(name, cost));
	}
	public  void printTotalAmount(){
		int sum=0;
		for(Product product:products){
			sum=sum+product.getCost();
			
		}
		System.out.println("Стоимость товаров по чеку номер "+numberOfPayment+" : "+sum);
	}

private class Product{
		private String name;
		private int cost;
		public Product(String name, int cost) {
			super();
			this.name = name;
			this.cost = cost;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		
	}

	
	
}
