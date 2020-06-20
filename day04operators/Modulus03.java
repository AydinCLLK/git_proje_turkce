package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {

		// Kullanicidan 3 basamakli bir tam sayi alin bu sayinin rakamlarinin toplamini
		// bulun

		Scanner scan = new Scanner(System.in);

		System.out.println("3 basamakli bir tamsayi giriniz...");

		int sayi = scan.nextInt();

		int sonRakam = sayi % 10;

		int v = sayi / 10;
		int ortaRakam = v % 10;

		int ilkRakam = sayi / 100; // 3 basamakli sayilarin ilk rakamini bulmak icin sayi 100'e bolunur
									// 4 basamakli sayilarin ilk rakamini bulmak icin sayi 1000'e bolunur vs...

		System.out.println(sonRakam + ortaRakam + ilkRakam);
		scan.close();

	}

}
