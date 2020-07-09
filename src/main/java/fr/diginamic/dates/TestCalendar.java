package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
	public static void main(String[] args) {
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMMM/yyyy � HH/mm/ss", new Locale("zh", "ZH"));
		Date date = new Date();
		
		String dateString = formateur.format(date);
		System.out.println(dateString);
	}
}
