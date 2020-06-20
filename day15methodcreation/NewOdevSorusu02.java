package day15methodcreation;

import java.util.Scanner;

public class NewOdevSorusu02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise ekrana
		// “Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Birinci sayiyi giriniz...:");
		int num1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz...:");
		int num2 = scan.nextInt();
		
		islem(num1,num2);
		
		scan.close();

	}
	
	public static void islem(int num1, int num2) {
		
		if(num1==num2) {
			System.out.println("Sayilar esit");
		}else if(num1>num2) {
			System.out.println("Birinci sayi buyuk");
		}else if(num1<num2) {
			System.out.println("Ikinci sayi buyuk");
		}else {
			System.out.println("Tekrar deneyin");
		}
		
	}

}
