package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yasadiginiz ulkeyi girin...:");
		String ulke = scan.next();
		
		System.out.println(ulke.substring(0, 2).toUpperCase());
		
		scan.close();
	}

}
