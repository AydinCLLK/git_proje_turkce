package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {

		// Kullanicidan adini ve soyadini aliniz
		// 1)Ad ve soyadini console’a yazdirin
		// 2)Sadece adini console’a yazdirin
		// 3)Ad ve soyadinin ilk harflerini console’a yazdirin
		// 4)Ad ve soyadini console’a tersten yazdirin
		// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada
		// console’a yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Adinnizi giriniz");
		String name = scan.nextLine();

		System.out.println("Soy adininiz giriniz");
		String soyad = scan.nextLine();

		System.out.println(name + " " + soyad);

		System.out.println(name);

		System.out.println(name.charAt(0));
		System.out.println(soyad.charAt(0));

		String ters = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			ters = ters + name.charAt(i);
		}

		String ters1 = "";

		for (int i = soyad.length() - 1; i >= 0; i--) {
			ters1 = ters1 + soyad.charAt(i);
		}

		System.out.println(ters + " " + ters1);

		String tamIsim = name + " " + soyad;
		String arr[] = tamIsim.split("");
		Arrays.sort(arr);
		System.out.println("Harflerin alfabetik siralamasi = " + Arrays.toString(arr));

		scan.close();
	}

}
