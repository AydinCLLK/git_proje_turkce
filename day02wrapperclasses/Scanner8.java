package day02wrapperclasses;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
		/*
		 * Mil’i kilometreye çeviren bir program yazınız. (double kullanınız) Not 1: km
		 * = mile x 1.6
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen kilometreyi girin...");

		double mil = scan.nextDouble();

		System.out.println(mil + " kilometre = " + mil * 1.6 + " mil dir");

		scan.close();
	}

}
