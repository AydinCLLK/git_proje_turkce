package day11stringmethods;

import java.util.Scanner;

public class FoorLoopOdev02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
		// başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Baslangic degerini girin...:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin...:");
		int num2 = scan.nextInt();
		
		if(num1%2==0 ) {
		for(int i=num1; i<=num2; i=i+2) {
			System.out.print(i + " ");
		}
		}else if(num1%2!=0) {
			for(int i=num1+1; i<=num2; i=i+2) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
