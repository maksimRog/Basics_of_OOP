package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Flower> flowers = new ArrayList<>();
		flowers.add(Flower.CLOVE);
		flowers.add(Flower.ROSE);
		flowers.add(Flower.TULIP);
		FlowerComposition flowerComposition = new FlowerComposition();

		printMenu();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Введите название упаковки");
				String s = scanner.next();
				System.out.println("Выберите цветы для композиции(введите ок для подтверждения.)");
				int counter = 0;
				for (Flower flower : flowers) {
					System.out.println(counter + " - " + flower);
					counter++;
				}

				while (!scanner.hasNext("ok")) {

					int index = scanner.nextInt();
					flowerComposition.addFlower(flowers.get(index));
					flowerComposition.setPackageOf(s);
				}
				scanner.next();
				break;
			case 2:

				flowerComposition.print();
				break;
			case 3:
				System.out.println("Введите название цветка");
				String name = scanner.next();
				System.out.println("Введите стоимость цветка");
				int cost = scanner.nextInt();
				flowers.add(new Flower(name, cost));
				System.out.println("Цветок добавлен!");

				break;
			case 4:

				for (Flower flower : flowers) {
					System.out.println(flower);
				}
				break;
			default:
				System.out.println("Введено неправильное число!");
				break;
			}

			printMenu();
		}

		scanner.close();

	}

	public static void printMenu() {
		System.out.println("Меню: ");

		System.out.println("1 - создать композицию" + ", 2 - распечатать составленную композицию"
				+ ", 3 - добавить цветок" + ", 4 - показать цветы");
		System.out.println();
	

	}
}
