package task3;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private List<Holiday>holidays;
	
	
	public Calendar() {
		super();
		this.holidays = new ArrayList<>();
	}
	public void addHoliday(String holidayName, String date, boolean isDayOff ){
		holidays.add(new Holiday(holidayName, date, isDayOff));
	}
	public void addDayOff( String date){
		holidays.add(new Holiday("", date, true));
	}
	
	public void printDays(){
		for(Holiday holiday: holidays){
			System.out.println(holiday);
		}
		
	}
	private  class Holiday {
		private String holidayName;
		private String date;
		private boolean isDayOff;
		
		
	
		public Holiday(String holidayName, String date, boolean isDayOff) {
			super();
			this.holidayName = holidayName;
			this.date = date;
			this.isDayOff = isDayOff;
		}
		
		
		
		@Override
		public String toString() {
			if(holidayName==""){
				return "Выходной день: "+date;
			}else if(isDayOff){
				return "Праздничный день: "+holidayName+", Число: "+date+" Не Рабочий.";
			}else {
				return "Праздничный день: "+holidayName+", Число: "+date+" Рабочий.";
		}

	}

	
		
		
	}
}
