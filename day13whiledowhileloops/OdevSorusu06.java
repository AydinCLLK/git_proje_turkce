package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
		// indexini ekrana yazdırın. “a” harfi yoksa ekrana “a harfi yok” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime veya cumle girin...:");
		String str = scan.nextLine();
		
		
		if(str.contains("a")) {
			System.out.println(str.indexOf("a"));
		}else {
			System.out.println("a harfi yok...:");
		}

		scan.close();
	}

}
