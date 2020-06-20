package day08ternaryoperator;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci tamsayiyi girin...:");
		int num1 = scan.nextInt();
		System.out.println("Ikinci tamsayiyi girin...:");
		int num2 = scan.nextInt();
		
		int result = num1>num2 ? num1 : num2;
		System.out.println("Girdiginiz en buyuk sayi...:" + result);
		
		scan.close();
	}
}
