package day08ternaryoperator;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın.
		// mutlak deger : Bir sayinin sifira olan uzakligidir.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayi girin...:");
		int num = scan.nextInt();
		
		int result = num>=0 ? num : num*-1;
		System.out.println("Mutlak deger...:" + result);
		
		scan.close();
	}

}
