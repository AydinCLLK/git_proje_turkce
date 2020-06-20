package day09switchoperator;

import java.util.Scanner;

public class SwitchOdev05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın.
		// A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
		// Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A, B, C, D  harflerinden birini girin...:");
		
		char ch = scan.next().toLowerCase().charAt(0);
		
		
		switch (ch) {
		
		case 'c':
			System.out.println("Dogru cevap");
			break;
		case 'a':
			System.out.println("Yanlis cevap");
			break;
		case 'b':
			System.out.println("Yanlis cevap");
			break;
		case 'd':
			System.out.println("Yanlis cevap");
			break;
			default:
				System.out.println("Gecersiz cevap sikki");
				
			
		}
		scan.close();

	}

}
