package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi yazin...:");
		String ad = scan.nextLine();
		ad=ad.trim();
		System.out.println("Soyadinizi yazin...:");
		String soyad = scan.nextLine();
		soyad = soyad.trim();
		
		System.out.println("Adinizin harf sayisi...:" + ad.length());
		System.out.println("Soyadinizin harf sayisi...:" + soyad.length());
		
		
		scan.close();

	}

}
