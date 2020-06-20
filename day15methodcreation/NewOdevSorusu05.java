package day15methodcreation;

import java.util.Scanner;

public class NewOdevSorusu05 {

	public static void main(String[] args) {
		
		// Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran
		//Program yazınız. Ornegin; CAN ==> C
	                            //			A
								//			N
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime girin...:");
		String str = scan.nextLine().toUpperCase();
		
		
		yazi(str);
		
		scan.close();
	}

	public static void yazi(String str) {
		
		int yeni=0 ;
		do {
			System.out.println(str.charAt(yeni));
			yeni++;
			
		}while(yeni<str.length());
		
	}
}
