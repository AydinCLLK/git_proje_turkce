package day12scopewhileloop;

import java.util.Scanner;

public class WhileOdev06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
		// biten tüm harfleri büyük harf olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Baslangic harfini girin:");
		char harf1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini girin:");
		char harf2 = scan.next().toUpperCase().charAt(0);
		
//		if(harf1>harf2) {
//			System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
//		}
		while(harf1<=harf2) {
			System.out.print(harf1 + " - ");
			harf1++;
		}
		
		scan.close();

	}

}
