package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi girin...:");
		String ad = scan.nextLine();
		ad= ad.trim();
		System.out.println("Soyadinizi girin...:");
		String soyad = scan.nextLine();
		soyad=soyad.trim();
		
		System.out.println("Adinizin ilk harfi...:" + ad.toUpperCase().charAt(0));
		System.out.println("Soyadinizin ilk harfi...:" + soyad.toUpperCase().charAt(0));
		
		scan.close();
		
	}

}
