package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {

		// Kullanicidan alinan bir sayisinin kupunu hesaplayan bir program yaziniz
		// Not : a ' nin kupu : a * a * a

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir sayi giriniz...");

		int sayi = scan.nextInt();

		System.out.println("Girilen sayinin kupu..." + sayi * sayi * sayi);

		scan.close();

	}

}
