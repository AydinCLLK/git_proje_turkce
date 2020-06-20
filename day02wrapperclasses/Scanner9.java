package day02wrapperclasses;

import java.util.Scanner;

public class Scanner9 {

	public static void main(String[] args) {
		/*
		 * Saati saniyeye çeviren bir program yazınız. (long kullanınız) Not 1: Saniye =
		 * Saat x 60 x 60
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen saati giriniz...");

		long saniye = scan.nextLong();

		System.out.println(saniye + " Saat = " + saniye * 60 * 60 + " Saniye dir...");

		scan.close();

	}

}
