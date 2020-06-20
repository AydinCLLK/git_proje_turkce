package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
		// büyük harf olarak ekrana yazdırın.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Yasadiginiz ulkeyi girin...:");
		String ulke =scan.next();
		
		
		System.out.println("Bastan ikinci harf..:" + ulke.toUpperCase().charAt(1) + " " + "Sondan ikinci harf..:" + (ulke.toUpperCase().charAt(ulke.length()-2)));

		scan.close();
	}

}
