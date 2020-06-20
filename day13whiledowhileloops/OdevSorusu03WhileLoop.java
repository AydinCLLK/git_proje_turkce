package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu03WhileLoop {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
				// Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.

				Scanner scan = new Scanner(System.in);
				
				System.out.println("Bir sayi girin...:");
				int sayi = scan.nextInt();
				
				if(sayi<0) {
					System.out.println("Negatif sayi girmeyiniz...");
				}
				
				int num=1;
				while(num<=sayi) {
					if(sayi%num==0) {
						System.out.print(num + " - ");
					}
					num++;
				}
				scan.close();

	}

}
