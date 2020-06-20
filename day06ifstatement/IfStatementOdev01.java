package day06ifstatement;

import java.util.Scanner;

public class IfStatementOdev01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir tamsayı alin eger tamsayı 3 ile bolunebiliyorsa ekrana “3’un kati” yazdirin.
			3 ile bolunemiyorsa ekrana “3’un kati degildir” yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi girin...:");
		int num = scan.nextInt();
		
		if(num%3==0) {
			System.out.println("Girilen sayi 3' un katidir...");
		}if(num%3!=0) {
			System.out.println("Girilen sayi 3'un kati degildir");
		}
		
		scan.close();
	}

}
