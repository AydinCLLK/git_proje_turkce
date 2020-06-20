package day14dowhileloop;

import java.util.Scanner;

public class YeniOdevSorusu04 {

	public static void main(String[] args) {
		
		// Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın.
		// Eşit değilse tekrar iki sayı girmesini söyleyin.
		
		Scanner scan = new Scanner(System.in);
		int num1 ,num2;
		
		
		do {
			System.out.println("Birinci sayiyi giriniz...:");
			 num1 = scan.nextInt();
			System.out.println("Ikinci sayiyi giriniz...:");
			 num2 = scan.nextInt();
		}while(!(num1==num2));
		
		System.out.println("Kare olusturdunuz");
		
		scan.close();

	}

}
