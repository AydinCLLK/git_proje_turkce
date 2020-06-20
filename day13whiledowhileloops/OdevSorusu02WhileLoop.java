package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu02WhileLoop {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic degerini girin...:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin...:");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
		}
		
		
		while(num1<=num2) {
			if(num1%3==0 && num1%5==0) {
				System.out.print(num1 + " - ");
			}
			else if(num2%3==0 && num2%5==0) {
				System.out.print(num2 + " - ");
			}
			num1=num1+1;
		}
		
		scan.close();

	}

}
