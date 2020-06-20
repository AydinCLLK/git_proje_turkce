package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {

		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapan
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odecegi toplam fiyati ekrana yazdirin

		// orn : 60 Tl ye %20 indirim ==>60*80 /100

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen urun miktari girin");
		double miktar = scan.nextDouble();
		System.out.println("Lutfen birim fiyati girin");
		double birimFiyati = scan.nextDouble();

		if (miktar > 1000) {

			System.out.println("Toplam fiyati...:" + miktar * ((birimFiyati * 80) / 100));

		} else {
			System.out.println("Toplam fiyati...:" + (birimFiyati * miktar));

		}
		scan.close();
	}
}
                           
