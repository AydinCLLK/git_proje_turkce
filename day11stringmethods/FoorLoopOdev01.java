package day11stringmethods;

import java.util.Scanner;

public class FoorLoopOdev01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten tüm tamsayıları ekrana yazdırın.
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Baslangic sayisini girin...:");
		int num1 = scan.nextInt();
		System.out.println("Bitis sayisini girin...:");
		int num2 = scan.nextInt();
		
		for (int i = num1; i<num2+1; i++) {
			System.out.print(i + " ");
		}
		scan.close();

	}

}
