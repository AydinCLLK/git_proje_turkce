package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir yıl girmesini isteyin, 
		// yıl artık yıl ise ekrana “Artık yıl” 
		// degilse ekrana “Artık yıl degil”	yazdırın.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Yil giriniz...:");
		int year = scan.nextInt();
		
		String result = (year%100==0) ? (year%400==0 ? "Artik Yil" : "Artik Yil Degil") : (year%4==0 ? "Artik Yil" : "Artik Yil Degil" );
		System.out.println(result);
		
		scan.close();

	}

}
