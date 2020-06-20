package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu04 {

	public static void main(String[] args) {
		
		// Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın.
		// Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime veya cumle girin...:");
		String str = scan.nextLine();
		
		System.out.println(str.substring(0,4));
		
		scan.close();

	}

}
