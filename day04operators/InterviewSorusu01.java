package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 { // mulakatta sorulabilecek sorular

	public static void main(String[] args) {

		// Iki tane variable'in degerlerini yer degistiriniz
		// orn : sayi1 = 12 , sayi2 = 30 yazılacak kodla sayi1 = 30 , sayi2 = 12
		// olacacak
		// bu isleme swap denir.

		// 1.yol

		Scanner scan = new Scanner(System.in);

		System.out.println("Yerlerini degistirmek icin 2 sayi giriniz...");

		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		System.out.println("...Yer degistirmeden once...");
		System.out.println(sayi1);
		System.out.println(sayi2);

		double gecici = 0.0;
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;

		System.out.println("...Yer degistirdikten sonra...");
		System.out.println(sayi1);
		System.out.println(sayi2);
		System.out.println(gecici);

		// 2.YOL

		System.out.println("Yer degistirmek icin iki sayi daha girin");

		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();

		System.out.println("Yer degistirmeden once...");
		System.out.println(sayi3);
		System.out.println(sayi4);

		sayi3 = sayi3 + sayi4;
		sayi4 = sayi3 - sayi4;
		sayi3 = sayi3 - sayi4;

		System.out.println("Yer degistirdikten sonra...");
		System.out.println(sayi3);
		System.out.println(sayi4);

		scan.close();
	}

}
