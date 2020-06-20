package day06ifstatement;

import java.util.Scanner;

public class IfStatementOdev04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın.
			Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.sayiyi girn...:");
		int num1 = scan.nextInt();
		System.out.println("2.sayiyi girin...:");
		int num2 = scan.nextInt();
		
		if(num1>0 && num2>0 || num1<0 && num2<0 ) {
			System.out.println("Ayni isaretli");
		} if(num1>0 && num2<0 || num1<0 && num2>0 ) {
			System.out.println("Farkli isaretli");
		}
		scan.close();
	}

}
