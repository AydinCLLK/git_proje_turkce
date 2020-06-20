package day12scopewhileloop;

import java.util.Scanner;

public class WhileOdev02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Baslangic degerini girin:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin:");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
		}else {
		
		while(num1<=num2) {
			
				System.out.print(num1 + " ");
				num1++;
			}
			
		}
		
		scan.close();
		
	}

}
