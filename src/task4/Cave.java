package task4;

import java.util.ArrayList;
import java.util.List;

public class Cave {
	private List<Treasure> treasures;
	
	public Cave() {
		super();
		this.treasures = new ArrayList<>();
	}
	public void addTreasure(String name,int cost){
		treasures.add(new Treasure(name, cost));			
	}
	public void printAllTreasures(){
		for(Treasure treasure: treasures){
			System.out.println(treasure);
		}
	}
	public void showByUserCost(int cost){
		for(Treasure treasure: treasures){
			if(treasure.getCost()<cost){
				System.out.println(treasure);
			}
		}
	}
	public void printTheMostValued(){
		int max=0;
		int index=0;
		int counter=0;
		for(Treasure treasure: treasures){
			counter++;
			if(treasure.getCost()>max){
				index=counter;
				max=treasure.getCost();
			}
		}
		System.out.println("Самое дорогое сокровище: "+treasures.get(index-1));
	}
	private class Treasure{
		private String name;
		private int cost;
		
		@Override
		public String toString() {
			return name+" Стоимость: "+cost;
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

		public Treasure(String name, int cost) {
			super();
			this.name = name;
			this.cost = cost;
		}
		
		
		
		
	}
	
	
}
