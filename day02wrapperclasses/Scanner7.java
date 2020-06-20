package day02wrapperclasses;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
		/*
		 * Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir
		 * Program yazınız. (byte kullanınız) Not 1: Üçgenin Cevresi: a + b + c
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 1.sayiyi giriniz...");
		byte sayi1 = scan.nextByte();

		System.out.println("Lutfen 2.sayiyi giriniz...");
		byte sayi2 = scan.nextByte();

		System.out.println("Lutfen 3.sayiyi giriniz...");
		byte sayi3 = scan.nextByte();

		System.out.println("Ucgenin Cevresi..." + (sayi1 + sayi2 + sayi3));

		scan.close();

	}

}
