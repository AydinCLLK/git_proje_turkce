package day02wrapperclasses;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		/*
		 * Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini
		 * hesaplayan bir program yazınız. Not: Dikdörtgenler Prizmasının Hacmi: En x
		 * Boy x Yükseklik
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 3 sayi giriniz...");

		int en = scan.nextInt();
		int boy = scan.nextInt();
		int yukseklik = scan.nextInt();

		System.out.println("Diktortgenin Prizmasinin Hacmi..." + en * boy * yukseklik);

		scan.close();
	}

}
