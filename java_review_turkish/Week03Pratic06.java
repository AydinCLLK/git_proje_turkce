package java_review_turkish;

import java.util.Scanner;

public class Week03Pratic06 {

	public static void main(String[] args) {
		
		/*
		  Kullanici  iki sayi girsin 
		  Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
		  Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
		  ve sonucunu ekrana yazdirsin. //
		  Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
		  Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
		*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi girin.:");
		int num1 = scan.nextInt();
		System.out.println("Ikinci sayiyi girin.:");
		int num2 = scan.nextInt();
		
		System.out.println("Birinci sayinin karesi..:" + (num1*num1));
		System.out.println("Ikinci sayinin karesi..:" + (num2*num2));
		
		System.out.println("Birinci sayinin 5 ile carpimi..:" + (num1*5));
		System.out.println("Ikinci sayinin 5 ile carpimi..:" + (num2*5));
		
		System.out.println("Birinci sayinin 12 ile toplami..:" + (num1 + 12));
		System.out.println("Ikinci sayinin 12 ile toplami..:" + (num2 + 12));
		
		System.out.println("Birinci sayinin 5 eksigi..:" + (num1-5));
		System.out.println("Ikinci sayinin 5 eksigi..:" + (num2-5));
		
		scan.close();
	}

}
