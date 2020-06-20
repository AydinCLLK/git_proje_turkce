package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementOdev01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
			0 ise ekrana “Nötr” yazdırın. 0 dan büyük ise ekrana “Pozitif” yazdırın.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi girin...:");
		int num = scan.nextInt();
		
		if(num<0) {
			System.out.println("Negatif");
		}else if(num==0) {
			System.out.println("Notr");
		}else if(num>0) {
			System.out.println("Pozitif");
		}
		
		scan.close();
	}

}
