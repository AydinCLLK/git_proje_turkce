package java_review_turkish;

import java.util.Scanner;

public class Day02Pratic04 {

	public static void main(String[] args) {
		/* 
        scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
                 1983
                 2020        
        5.Adım Raporu aşağıdaki gibi yazdırınız      
                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
           //Şifre= 37HEi56        
        */
        
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Adinizi girin...:");
		String ad = scan.nextLine();
		System.out.println("Soyadinizi girin...:");
		String soyad = scan.nextLine();
		
		System.out.println("Dogum yilinizi girin...:");
		int dogumYili = scan.nextInt();
		System.out.println("Simdiki yili girin...:");
		int simdikiYil = scan.nextInt();
		int yas=simdikiYil-dogumYili;
		
		String rapor= ("Adiniz: " + ad+"  Soyadiniz : "+soyad + ": "+ "  Simdiki Yasiniz : " + yas);
		System.out.println(rapor);
		
		String sifre = yas + ad.substring(0, 1) + soyad.charAt(0) + soyad.charAt(soyad.length()-1) + ad.length() + soyad.length();
		System.out.println("Sifreniz...:" + sifre);

		
		
		

		scan.close();
	}

}
