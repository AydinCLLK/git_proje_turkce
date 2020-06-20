package day07nestedif;

import java.util.Scanner;

public class NestedIfOdev03 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tam sayi olan password girin");
		int pass = scan.nextInt();
		
		if(pass%5 == 0) {
			if(pass%10 == 0) {
				System.out.println("5'e bolunen cift sayi");
			}else if(pass%10!=0) {
				System.out.println("5'e bolunen tek sayi");
			}
		}else if(pass!=0) {
			System.out.println("Tekrar deneyin");
		}
		scan.close();

	}

}
