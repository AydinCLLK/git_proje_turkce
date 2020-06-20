package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {

		// Kullanicidan bir tam sayi isteyin ve o tam sayinin mutlak degerini ekrana
		// yazdirin
		// mutlak deger sayinin kendi isareti ile carpilmasi demektir
		// orn : -3 un mutlak degeri ==> -1*-3 demektir
		// orn : +5 in mutlak degeri ==> +1*+5 demektir
		// orn : 0 in mutlak degeri 0 dir

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz...:");
		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("Sayinin mutlak degeri...:" + (num * (+1)));
		} else {
			System.out.println("Sayinin mutlak degeri...:" + (num * (-1)));
		}

		scan.close();
	}

}
