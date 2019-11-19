package task4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Cave cave =new Cave();
	cave.addTreasure("Tiara", 100);
	cave.addTreasure("crown", 200);
	cave.addTreasure("the golden cane.", 250);
	printMenu();
	
	Scanner scanner =new Scanner(System.in);
	while (scanner.hasNext()){
		
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
			cave.printAllTreasures();
			break;
		case 2:
			cave.printTheMostValued();
			break;
		case 3:
			System.out.println("Введите цену");
			cave.showByUserCost(scanner.nextInt());
			break;
		default:
			System.out.println("Введено неправильное число!");
			break;
		}
		printMenu();
	}
	scanner.close();

}
public static void printMenu(){
		System.out.println("Меню: ");

		System.out.println("1 - показать сокровища");
		System.out.println("2 - показать самое ценное сокровище");
		System.out.println("3 - показать сокровища по стоимости меньше заданной цены");

		
	}
}
