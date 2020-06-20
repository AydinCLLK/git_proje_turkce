package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementOdev04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
		 * Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir karakter girin...:");
		
		char ch = scan.next().charAt(0);
		
		if (ch>=65 && ch<=90 || ch>=97 && ch<=122) {
			System.out.println("Harf");
		}else {
			System.out.println("Harf degil");
		}
			
	
		
		
		
		
		
		//String str = scan.next();
		
	//	if(str.equals("a") || str.equals("b")|| str.equals("c") || str.equals("d") || str.equals("e") || str.equals("f") || str.equals("g")|| str.equals("h") || str.equals("j") || str.equals("k") || str.equals("l") || str.equals("m")|| str.equals("n") || str.equals("o") || str.equals("p") || str.equals("r") || str.equals("s")|| str.equals("t") || str.equals("u") || str.equals("v") || str.equals("y") || str.equals("z")|| str.equals("w") || str.equals("x") ) {
		//	System.out.println("Harf");
	//	}else {
	//		System.out.println("Harf Degil");
	//	}
		scan.close();
	}

}
