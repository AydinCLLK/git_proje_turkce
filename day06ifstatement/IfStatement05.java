package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {

		// Kullanicidan bir dikdortgenin en ve boyunu alin
		// En ve Boy esit ise ekrana bu bir karedir yazdirin
		// en ve boy farkli ise ekrana bu bir dikdortgendir yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Dikdortgenin En degerini girin");
		double en = scan.nextDouble();
		System.out.println("Dikdortgenin Boy degerini girin");
		double boy = scan.nextDouble();

		/*
		 * if (en==boy) { System.out.println("Bu bir karedir"); } if(en!=boy) {
		 * System.out.println("Bu bir dikdortgendir"); }
		 */

		// else ==> diger ihtimallerin tamami
		// en ile boy ya esittir ya da degildir

		if (en == boy) {
			System.out.println("Bu bir karedir");
		} else {
			System.out.println("Bu bir dikdortgendir");
		}

		scan.close();
	}

}
