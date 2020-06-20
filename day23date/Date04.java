package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {

		// Date formatini degistirmek

		LocalDate date = LocalDate.now();
		System.out.println(date);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(dtf.format(date)); // ekranda 20-May-2020

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dtf1.format(date)); // ekranda 20-05-2020

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf2.format(date)); // ekranda 2020/5/20

		System.out.println("===============================");

		// Time Formatini degistirmek

		LocalTime time = LocalTime.now();

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm"); // H kullanilirsa 24 luk dilimi kullanilir. Kucuk
																		// h 12 lik saat dilimi
		System.out.println(dtf3.format(time));

		// Baska ulkenin local zamani almak
		System.out.println(time.now(ZoneId.of("Europe/Berlin")));

	}

}
