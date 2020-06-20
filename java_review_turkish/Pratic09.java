package java_review_turkish;

import java.util.Scanner;

public class Pratic09 {

	public static void main(String[] args) {
	  /*	
	   	scanner kullanılarak 3 sayı alınacak ve toplamı bulunacak
		
	   */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 1.tamsayiyi giriniz...:");
		int num1 = scan.nextInt();
		System.out.println("Lutfen 2.tamsayiyi giriniz...:");
		int num2 = scan.nextInt();
		System.out.println("Lutfen 3.tamsayiyi giriniz...:");
		int num3 = scan.nextInt();
		System.out.println("Girilen Sayilarin toplami...:" + (num1+num2+num3));
		
		scan.close();
		
		
		
		
	}

}
