package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyin
		// Password dogru ise ekrana "Password Dogru" yazdirin
		// Password yanlis ise ekrana "Password yanlis tekrar deneyin" yazdirin
		// Dogru password = Java2020

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen password giriniz...:");
		String password = scan.next();

		// String'lerin esitligini kontrol ederken
		// Asla == sembolu kullanmayin
		// Onun yerine "equals()" kullanilir

		// "==" sembolu String'in degerini ve adresini kontrol eder
		// "equals()" ise sadece degerleri kontrol eder.

		if (password.equals("Java2020")) {
			System.out.println("Password Dogru");
		} else {
			System.out.println("Password yanlis tekrar deneyin");
		}
		scan.close();
	}

}
