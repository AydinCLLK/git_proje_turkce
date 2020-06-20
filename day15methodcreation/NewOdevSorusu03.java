package day15methodcreation;

import java.util.Scanner;

public class NewOdevSorusu03 {

	public static void main(String[] args) {
		
		// Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
		// yazdıran bir program yazın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz...:");
		int num = scan.nextInt();
		int sum =0;
		
		islem(num,sum);
		
		scan.close();

	}
	
	public static void islem(int num,int sum) {
	
		do{
		sum=sum+ (num%10);
		num=num/10;
		
		}while(num>0);
		System.out.println(sum);
	}

}
