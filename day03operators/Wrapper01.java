package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {

		// Kullanicidan ad ve soyadini alip yazdiran bir program yaziniz
		// String kullaniniz

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen adinizi ve soyadinizi giriniz...");

		String isim = scan.nextLine(); // String'leri kullanicidan almak icin ya next() veya nextLine() kullanilir
										// next() = Tek kelimelik String'ler icin kullanilir
										// space si gorunce String'i almayi birakir.
										// nextLine() = Girilen tum String'i almak icin kullanilir.

		System.out.println(isim);
		scan.close();
	}

}
