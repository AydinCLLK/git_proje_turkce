package day12scopewhileloop;

import java.util.Scanner;

public class WhileOdev05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten tüm tamsayıların çarpımını ekrana yazdırın.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Baslangic degerini girin:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin:");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
		}
		
		int product =1;
		for(int i=num1; i<=num2; i++) {
			product=product*i;
		}
		System.out.println("Carpimlari : " + product);

		scan.close();
	}

}
