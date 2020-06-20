package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		/*
		 * Kullanici dan ilk ismini alin ekrana yazdirin Kullanici dan soyismini alin
		 * ekrana ilk isminin altina yazin
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen ilk isminizi giriniz...");
		String ilkIsim = scan.nextLine();

		System.out.println("Soy isminizi giriniz...");
		String soyIsim = scan.nextLine();

		System.out.println(ilkIsim);
		System.out.println(soyIsim);
		scan.close();
	}

}
