package day11stringmethods;

import java.util.Scanner;

public class FoorLoopOdev04 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten tüm tamsayıların toplamını ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic degerini girin...:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin...:");
		int num2 = scan.nextInt();
		
		int sum=0;
		for (int i = num1 ; i<=num2 ; i++) {
			sum = sum +i;
		}
		System.out.print("Sayilarin toplami...:" + sum);

		scan.close();
	}
	

}
