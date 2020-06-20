package day23date;

import java.time.LocalDate;

public class AlistirmaDate02 {

	public static void main(String[] args) {
		
		// Date Manipulation (Date uzerinde degisiklikler yapmak)
		
		
		// Tarih ekleme
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.plusDays(2));
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusYears(2));
		
		System.out.println("============");
		// Tarih Cikarma
		System.out.println(date.minusDays(3));
		System.out.println(date.minusMonths(3));
		System.out.println(date.minusYears(3));

	}

}
