package day15methodcreation;

import java.util.Scanner;

public class NewOdevSorusu01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük
		// diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Isminizi giriniz...:");
		String ad = scan.nextLine().toLowerCase();
		char ch1 = ad.toUpperCase().charAt(0);
		System.out.println("Soyadinizi giriniz...:");
		String soyad = scan.nextLine().toLowerCase();
		char ch2 = soyad.toUpperCase().charAt(0);

		isim(ad,ch1,soyad,ch2);
		
		scan.close();
	}
	//, ad.length() , soyad.length())
	
	public static void isim(String ad,char ch1,String soyad,char ch2) {
		
		System.out.println("Adiniz Soyadiniz..:" + (ch1 + ad.substring(1)) + " " + (ch2 + soyad.substring(1)));
	}

}
