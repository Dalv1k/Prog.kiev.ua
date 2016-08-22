package net.ukr.p454.task3alter;

import java.util.Calendar;
import java.util.Date;


public class DataBuilder {
	
	public static Date getDate(int day, int month, int year){
		Calendar date = Calendar.getInstance();
		//We usually use from 1 to 12
		date.set(year, month-1, day);
		return date.getTime();
	} 
}
