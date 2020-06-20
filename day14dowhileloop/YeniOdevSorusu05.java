package day14dowhileloop;

import java.util.Scanner;

public class YeniOdevSorusu05 {

	public static void main(String[] args) {
		
		// Kullanıcıya bir String girmesini söyleyin ve bu String’in ilk harfi ile son harfi aynı ise
		// ekrana “Simetrik” yazdırın. Aynı değilse tekrar bir String girmesini isteyin.

		Scanner scan = new Scanner(System.in);
		
		
		char ilk,son;
		
		do {
			System.out.println("Bir kelime veya cumle giriniz...:");
			String str=scan.nextLine();
			 ilk = str.charAt(0);
			 son = str.charAt(str.length()-1);
		}while(!(ilk==son));
		
		System.out.println("Simetrik");
		
		scan.close();
	}
	

}
