package day12scopewhileloop;

import java.util.Scanner;

public class WhileOdev03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
		// başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları while loop kullanarak
		// ekrana yazdırınız.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Baslangic degerini girin:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin:");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
		}
		while(num1<=num2) {
			if (num1%2==0) {
				System.out.print(num1 + " ");
			}
			num1++;
		}

		scan.close();
	}

}
