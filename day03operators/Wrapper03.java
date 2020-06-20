package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		/*
		 * * Kullanicidan ad ve soyadini alalim ekrana yazdiralim * Kullanicidan adresi
		 * alalim ekrana yazdiralim ( 2. cadde Bakirkoy Istanbul Turkiye ) *
		 * Kullanicidan yasini alalim ekrana yazdiralim * Kullaniciya Turkiye'de
		 * yasiyorum ( Dogru / Yanlis ) diye soralim cevabi ekrana yazdiralim * True
		 * yada false olarak
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen adinizi ve soyadinizi giriniz... ");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);

		System.out.println("Lutfen adresinizi giriniz... ");
		String adres = scan.nextLine();
		System.out.println(adres);

		System.out.println("Lutfen yasinizi giriniz...");
		int yas = scan.nextInt();
		System.out.println(yas);

		System.out.println("Turkiye'de yasiyorum...True / False...");
		boolean blTr = scan.nextBoolean();
		System.out.println(blTr);

		scan.close();

	}

}
