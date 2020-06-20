package day14dowhileloop;

import java.util.Scanner;

public class YeniOdevSorusu06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.
		// “a” harfi yoksa tekrar bir String girmesini isteyin.
		
		Scanner scan = new Scanner(System.in);
		String str;
		
		do {
			System.out.println("Bir kelime girin...:");
			 str = scan.nextLine();
			
			
		}while(!(str.contains("a") || (str.contains("A"))));

		System.out.println("a harfi var");
		
		scan.close();
	}

}
