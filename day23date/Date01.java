package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {

		// Bugunun tarihini ekrana yazdiralim
		System.out.println(LocalDate.now());

		// Bugunun zamanini saat, dakika, saniye ve salise olarak ekrana yazdiralim
		System.out.println(LocalTime.now());

		// Bugunun tarihini ve zamani ekrana yazdiralim
		System.out.println(LocalDateTime.now()); // ekranda 2020-05-20T18:03:09.377 Buradaki "T" tarih ile
													// zamani ayirmak icin konulur.

	}

}
                                