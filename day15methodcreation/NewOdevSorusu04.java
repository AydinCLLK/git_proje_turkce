package day15methodcreation;

import java.util.Scanner;

public class NewOdevSorusu04 {

	public static void main(String[] args) {
		
		// Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
		// Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("paralelkenar, dikdortgen ve ucgen kelimelerinden birini seciniz...:");
		String islem = scan.next();
		System.out.println("Birinci sayiyi giriniz...:");
		int num1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz...:");
		int num2 = scan.nextInt();
		
		islem(islem,num1,num2);
		scan.close();

	}
	public static void islem(String islem, int num1, int num2) {
		
		switch(islem) {
		
		case "paralelkenar":
			System.out.println("paralelkenar alani...:" + (num1*num2));
			System.out.println("paralelkenar cevresi...:" + (2*(num1+num2)));
			break;
		case "dikdortgen":
			System.out.println("dikdortgen alani...:" + (num1*num2));
			System.out.println("dikdortgen cevresi...:" + (2*(num1+num2)));
			break;
		case "ucgen":
			System.out.println("ucgen alani...:" + (num1*num2));
			System.out.println("ucgen cevresi hesaplanmasi icin yeteri bilgi bulunamadi...:");
			break;
		default:
			System.out.println("paralelkenar, dikdortgen ve ucgen kelimelerinden birini secmediniz");
		}
	}

}
