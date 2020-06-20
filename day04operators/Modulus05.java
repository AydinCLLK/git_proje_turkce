package day04operators;

import java.util.Scanner;

public class Modulus05 {

	public static void main(String[] args) {
		// Kullanıcının girdiği 4 basamaklı sayının tum rakamlarının toplamını
		// ekrana yazdıran bir program yazınız.

		Scanner scan = new Scanner(System.in);

		System.out.println("4 basamakli bir tamsayi girin...:");
		int sayi = scan.nextInt();

		int ilkRakam = sayi % 10;
		int ikiRakam = sayi / 10;
		int aRakam = ikiRakam % 10;
		int ucRakam = sayi / 100;
		int bRakam = ucRakam % 10;
		int sonRakam = sayi / 1000;

		System.out.println("Sayilarin toplami...:" + (ilkRakam + aRakam + bRakam + sonRakam));

		scan.close();
	}

}
