package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementOdev02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın
		 *  eğer üç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar üçgen” yazdırın. 
		 *  Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen” yazdırın.
		 *   Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.kenar uzunlugunu girin");
		double num1 = scan.nextDouble();
		System.out.println("2.kenar uzunlugunu girin");
		double num2 = scan.nextDouble();
		System.out.println("3.kenar uzunlugunu girin");
		double num3 = scan.nextDouble();
		
		if(num1==num2 && num1==num3 && num2==num3) {
			System.out.println("Eskenar Ucgen");
		}else if(num1==num2 || num1==num3 || num2==num3) {
			System.out.println("Ikizkenar ucgen");
		}else if(num1!=num2 && num1!=num3 && num2!=num3) {
			System.out.println("Cesitkenar Ucgen");
		}
		scan.close();
	}

}
