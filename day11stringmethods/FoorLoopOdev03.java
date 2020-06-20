package day11stringmethods;

import java.util.Scanner;

public class FoorLoopOdev03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
		// başlayıp bitiş değerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Baslangic degerini girin...:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin...:");
		int num2 = scan.nextInt();
		
		if(num1%3==0) {
		for(int i = num1; i<=num2; i=i+3) {
			System.out.print(i + " ");
		}
		}else {
			for(int i = num1+2; i<=num2; i=i+3) {
				System.out.print(i + " ");
			}
		}
		scan.close();

	}

}
