package day08ternaryoperator;

import java.util.Scanner;

public class HomeWork06 {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan bir yıl girmesini isteyin,
		// yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir yil girin");
		int year = scan.nextInt();
		
		String result =	(year%100==0 && year%400==0) ? "Artik yil" : (year%100!=0 && year%4==0)? "Artik yil" : "Artik yil degil";
		System.out.println(result);
	
		scan.close();
		

	}

}
