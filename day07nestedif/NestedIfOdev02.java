package day07nestedif;

import java.util.Scanner;

public class NestedIfOdev02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir harf girin...:");
		char harf = scan.next().charAt(0);
		
		if(harf>=97 && harf<=122) {
			if(harf==97) {
				System.out.println("Ilk kucuk harf");
			}else {
				System.out.println("Ilk kucuk harf degil");
			}
		}else if(harf>=65 && harf<=90) {
			if(harf==90) {
				System.out.println("Son buyuk harf");
			}else {
				System.out.println("Son buyuk harf degil");
			}
		}
		scan.close();

	}

}
