package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AlistirmaDate04 {

	public static void main(String[] args) {

		// Date formatini degistirmek
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(dtf1.format(date));
		
		// Time Formatini degistirmek
		System.out.println("===================");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf2.format(time));
		
		
		// Baska ulkenin local zamani almak
		System.out.println("=================");
	
		System.out.println(time.now(ZoneId.of("Europe/Berlin")));

	}

}
