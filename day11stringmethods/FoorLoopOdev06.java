package day11stringmethods;

import java.util.Scanner;

public class FoorLoopOdev06 {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
		// biten tüm harfleri büyük harf olarak ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic harfini girin...:");
		char harf1 = scan.next().toUpperCase().charAt(0); 
		System.out.println("Bitis harfini girin...:");
		char harf2 = scan.next().toUpperCase().charAt(0);
		
		
		for(char i =harf1 ; i<=harf2 ; i++) {
			System.out.print(i +" ");
			
		}
		scan.close();

	}

}
