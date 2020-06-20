package day06ifstatement;

import java.util.Scanner;

public class IfStatementOdev03 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
		“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. “Pazar” ise ekrana
		“Hıristiyanlar icin kutsal gün” yazdırın
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun girin...:");
		String day = scan.nextLine();
		
		if (day.equals("Cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		}if(day.equals("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}if(day.equals("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");
		}
		
		scan.close();	

	}

}
