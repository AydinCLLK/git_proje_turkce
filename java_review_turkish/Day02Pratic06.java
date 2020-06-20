package java_review_turkish;

import java.util.Scanner;

public class Day02Pratic06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı girmesini isteyiniz
				// Sayı tek sayı ise "Sayınız tek sayıdır."
				// Sayı çift sayı ise "Sayınız çift sayıdır." yazdırınız

		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bir sayi girin...:");
		int num= scan.nextInt();
		
		if (num%2==0) {
			System.out.println("Sayiniz cift sayidir.");
		}else {
			System.out.println("Sayiniz tek sayidir.");
		}
		scan.close();
	}

}
