package java_review_turkish;

import java.util.Scanner;

public class Day02Pratic05 {

	public static void main(String[] args) {
		
		// Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Saat girin...:");
		int saat = scan.nextInt();
		System.out.println("Dakika girin...:");
		int dakika = scan.nextInt();
		System.out.println("Saniye girin...:");
		int saniye = scan.nextInt();
		
		System.out.println("PM veya AM giriniz...:");
		String str =scan.next();
		
		System.out.println(saat + ":" + dakika + ":" + saniye +" "+ str);
		
		scan.close();

	}

}
