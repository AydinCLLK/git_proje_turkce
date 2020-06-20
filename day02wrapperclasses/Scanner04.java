package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve
		 * cevresini hesaplayıp ekrana yazdıran bir program yazınız. Not: Alan: Boy x En
		 * Not: Çevre: 2x (Boy + En)
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 2 sayi girin...");

		int en = scan.nextInt();
		int boy = scan.nextInt();

		System.out.println("Diktortgenin alani..." + en * boy);
		System.out.println("dikdortgenin cevresi..." + 2 * (en + boy));

		scan.close();
	}

}
