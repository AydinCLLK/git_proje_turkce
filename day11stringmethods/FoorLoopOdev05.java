package day11stringmethods;

import java.util.Scanner;

public class FoorLoopOdev05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten tüm tamsayıların çarpımını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic degerini girin...:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin...:");
		int num2 = scan.nextInt();
		
		int product = 1;
		for(int i=num1; i<=num2 ; i++) {
			product = product*i;
		}
		System.out.println("Sayilarin carpimi...:" + product);
		
		scan.close();
	}

}
