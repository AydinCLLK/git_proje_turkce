package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AlistirmaDate01 {

	public static void main(String[] args) {
		
		// Bugunun tarihini ekrana yazdiralim
		System.out.println(LocalDate.now());
		
		// Bugunun zamanini saat, dakika, saniye ve salise olarak ekrana yazdiralim
		System.out.println(LocalTime.now());
		
		// Bugunun tarihini ve zamani ekrana yazdiralim
		System.out.println(LocalDateTime.now());
	}

}
