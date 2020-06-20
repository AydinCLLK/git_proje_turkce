package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementOdev03 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. 
		 * Eğer urun miktarı 1000 den fazla ise
		  Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın.
		 Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Urun miktarini girin...:");
		int miktar = scan.nextInt();
		System.out.println("Birim fiyatini girin...:");
		double fiyat = scan.nextDouble();
		
		if(miktar>1000) {
			System.out.println(miktar*((fiyat*90)/100));
		}else {
			System.out.println(fiyat*miktar);
		}
		scan.close();
	}

}
