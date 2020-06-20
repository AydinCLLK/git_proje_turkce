package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		
		/* Kullanıcıdan iki sayı alın
		 * Bu sayı biribirine eşit ise toplamlarını ekrana yazdırın
		 * Bu sayı biribirinden farklı ise çarpımlarını ekrana yazdırın
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		double num1 = scan.nextDouble();
		System.out.println("Ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();
		
		double sonuc = num1==num2 ? num1+num2 : num1*num2;
		System.out.println(sonuc);
		
		scan.close();

	}

}
