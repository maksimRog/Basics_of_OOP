package task2;

public class Main {

	public static void main(String[] args) {
		Payment payment1=new Payment();
		payment1.buyProduct("Milk", 2);
		payment1.buyProduct("Apples", 3);
		payment1.printTotalAmount();
		
		Payment payment2=new Payment();
		payment2.buyProduct("Bananas", 100);
		payment2.buyProduct("Apples", 3);
		payment2.printTotalAmount();
	}

}
