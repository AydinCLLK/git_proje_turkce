package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
		// Kullanicidan Integer aldiktan sonra String alamiyoruz.
		// probleme cozum asagidadir
		
		Scanner scan = new Scanner(System.in);
		
		// SORUN == Java da nextInt() kullandiktan sonra nextLine() kullanirsak kod calismiyor
		// COZUM == nextInt() yerine nextLine() kullan sonra elde ettigin String'i 
		// 			Integer.parseInt() kullanarak integer'a cevir.
		
		System.out.println("Yasinizi giriniz...");
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas); // String'i tam sayiya cevirme metodu
											// Integer.parseInt() sadece rakam iceren Stringler icin kullanilir
		System.out.println(yeniYas);
		
		System.out.println("Adinizi ve Soyadinizi giriniz...");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();
	}

}
