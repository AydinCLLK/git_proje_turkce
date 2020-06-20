package day04operators;

import java.util.Scanner;

public class Modulus04 {

	public static void main(String[] args) {
		// Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını
		// ekrana yazdıran bir program yazınız.

		Scanner scan = new Scanner(System.in);

		System.out.println("4 basamakli bir tamsayi giriniz...");

		int sayi = scan.nextInt();
		int ilkRakam = sayi % 10;
		int sonRakam = sayi / 1000;

		System.out.println("sayilarin toplami...:" + (ilkRakam + sonRakam));

		scan.close();
	}

}
