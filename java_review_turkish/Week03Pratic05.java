package java_review_turkish;

import java.util.Scanner;

public class Week03Pratic05 {

	public static void main(String[] args) {
		
		//Kullanicidan iki farkli kelime yazsin - (String) olarak
		//Program  bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
		/* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
		kullaniriz. next() tek kelimelik String'ler icin kullanilir.
		Space gorunce String'i almayi birakir.
		nextLine() girilen tum String'i almak icin kullanilir.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci kelimeyi yazin.:");
		String str1 = scan.nextLine();
		System.out.println("Ikinci kelimeyi yazin.:");
		String str2 = scan.nextLine();
		
		System.out.println("Yeni cumlemiz : " + str1 + " " + str2 + "!");
		
		
		
		
		scan.close();

	}

}
