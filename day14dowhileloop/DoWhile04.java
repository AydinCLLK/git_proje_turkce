package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {

		// Kullanicidan bir String alin
		// Bu String'in indexi tek sayi olan character'lerini ekrana yazdirin
		// Orn : Almanya ==> l,a,y

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz. Bir harften fazla olsun...:");
		String str = scan.nextLine();

		int lenght = str.length();
		int i = 1;

		do {
			if (i % 2 == 1) {
				System.out.print(str.charAt(i) + " ");
			}
			i++;
		} while (i < lenght);

		scan.close();

	}

}
