package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementOdev03 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
			1. 50 den az - D 2. 50(dahil) ile 60 arası - C 3.
			 60(dahil) ile 80 arası - B. 4. 80(dahil) ustu- A
		 */
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Notunuzu girin...:");
		int num = scan.nextInt();
		
		if (num<50) {
			System.out.println("D");
		}else if(num<60) { 
			System.out.println("C");
		}else if(num<80) {
			System.out.println("B");
		}else if(num<=100) {
			System.out.println("A");
		}
		scan.close();
	}

}
