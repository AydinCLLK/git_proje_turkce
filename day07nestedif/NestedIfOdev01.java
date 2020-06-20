package day07nestedif;

import java.util.Scanner;

public class NestedIfOdev01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan cinsiyetini girmesini isteyin.
			Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
			Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
			Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
			Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Cinsiyet giriniz...:");
		String str = scan.next();
		
		
		if(str.equalsIgnoreCase("Erkek")) {
			System.out.println("Yas giriniz...:");
			int yas = scan.nextInt();
			
			if(yas<18) {
				System.out.println("Erkek cocuk");
			}else if(yas>=18) {
				System.out.println("Adam");
			}
		}else if(str.equalsIgnoreCase("Kadin")) {
			System.out.println("Yas giriniz...:");
			int yas = scan.nextInt();
			if(yas<18) {
				System.out.println("Kiz cocuk");
			}else if(yas>=18) {
				System.out.println("Kadin");
			}
		}else {
			System.out.println("Yanlis deger girdiniz...:");
		}
		scan.close();

	}

}
