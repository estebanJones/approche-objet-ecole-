package fr.diginamic.dates;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date(120, 7, 8);
		System.out.println(date);
		
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		System.out.println(date2);
		
		String dateFormat = (1900 + date2.getYear()) + "/" + date.getMonth() + "/" + date.getDay() + " " + date.getHours()+":"+date.getMinutes()+":"+ date.getSeconds();
		System.out.println(dateFormat);
	}

}
