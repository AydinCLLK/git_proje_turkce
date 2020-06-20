package day06ifstatement;

import java.util.Scanner;

public class IfStatementOdev02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcidan bir harf alin eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
			“b, c, d, e” den biri ise ekrana “Sessiz harf” yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kucuk bir harf girin...:");
		String harf = scan.next();
		
		if (harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o") || harf.equals("u") ) {
			System.out.println("Sesli Harf");
		} if(harf.equals("b") || harf.equals("c") || harf.equals("d") || harf.equals("e")) {
			System.out.println("Sessiz Harf");
		}

		
		scan.close();
	}

}
