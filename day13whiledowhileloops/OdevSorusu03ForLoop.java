package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu03ForLoop {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
		// Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi girin...:");
		int sayi = scan.nextInt();
		
		for(int i=1; i<=sayi ; i++) {
			if(sayi%i==0) {
				System.out.print(i + " - ");
			}
		}
		scan.close();
	}

}
