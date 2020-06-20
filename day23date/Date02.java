package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {

		// Date Manipulation (Date uzerinde degisiklikler yapmak)

		// Tarih ekleme
		LocalDate date = LocalDate.now();
		System.out.println(date); // Bugunun tarihini ekrana yazdirir
		System.out.println(date.plusDays(3)); // Bugunun tarihine 3 gun ekliyor. 3 gun sonraki gunun tarihi yazar
		System.out.println(date.plusDays(13)); // 2020-06-02 == gun fazla olunca ay veya yil da degisir
		System.out.println(date.plusDays(-1)); // 2020-05-19 bir onceki gunu yazdiriyor ama bu cok kullanilmaz

		System.out.println(date.plusWeeks(2)); // 2 hafta ekliyor
		System.out.println(date.plusMonths(2)); // Suan ki aya 2 ay ekler 2 ay sonrasinin tarihini yazar
		System.out.println(date.plusYears(2)); // 2022-05-20 yil ekler

		// Tarih Cikarma
		System.out.println(date.minusDays(3)); // 3 gun onceki tarih
		System.out.println(date.minusWeeks(1)); // 1 hafta onceki tarih
		System.out.println(date.minusMonths(2)); // 2 ay onceki tarih
		System.out.println(date.minusYears(4)); // 4 yil onceki tarih

	}

}
