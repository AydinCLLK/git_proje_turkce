package day14dowhileloop;

import java.util.Scanner;

public class YeniOdevSorusu03 {

	public static void main(String[] args) {
		
		// Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu
		// tüm sayıların toplamını yazdırınız.
		// Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
			System.out.println("Bir sayi giriniz...:");
			num =scan.nextInt();
			sum = sum + num ;
		}while(num!=0);
		System.out.println("Sifir girdiniz");
		
		System.out.println("Girdiginiz sayilarin toplami...:" + sum);
		
		scan.close();

	}

}
