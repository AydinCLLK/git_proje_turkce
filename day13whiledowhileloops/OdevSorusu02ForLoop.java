package day13whiledowhileloops;

import java.util.Scanner;

public class OdevSorusu02ForLoop {

	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic degerini girin...:");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini girin...:");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("Baslangic degeri bitis degerinden buyuk olamaz...");
		}
		
		for(int i=num1; i<num2 ; i++) {
			
			if(i%3==0 && i%5==0 ) {
				System.out.print(i + " - ");
			} 
		}
		scan.close();

	}

}
