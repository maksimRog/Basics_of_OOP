package task3;

public class Main {

	public static void main(String[] args) {
		Calendar calendar=new Calendar();
		calendar.addHoliday("halloween", "15.10", true);
		calendar.addHoliday("Victory day", "09.05", true);
		calendar.addHoliday("Women's Day ", "08.04", true);
		calendar.addDayOff("25.08");
		calendar.addDayOff("1.01");
		calendar.printDays();

		
	}

}
