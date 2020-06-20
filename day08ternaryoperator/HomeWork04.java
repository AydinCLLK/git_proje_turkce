package day08ternaryoperator;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		// En ve boy eşit ise ekrana “Kare” farklı ise ekrana “Dikdörtgen” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dikdortgenin En uzunlugunu girin...:");
		double en = scan.nextDouble();
		System.out.println("Dikdortgenin Boy uzunlugunu girin...:");
		double boy = scan.nextDouble();
		
		String result = en==boy ? "Kare" : "Dikdortgen";
		System.out.println(result);
		
		scan.close();

	}

}
