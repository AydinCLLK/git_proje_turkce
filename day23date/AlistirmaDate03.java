package day23date;

import java.time.LocalTime;

public class AlistirmaDate03 {

	public static void main(String[] args) {
		
		// Time Manipulation (Zamani degistirecegiz)
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("===========");
		
		System.out.println(time.plusSeconds(30));
		System.out.println(time.plusMinutes(10));
		System.out.println(time.plusHours(2));
		
		System.out.println("===============");
		
		System.out.println(time.minusSeconds(30));
		System.out.println(time.minusMinutes(30));
		System.out.println(time.minusHours(3));

	}

}
