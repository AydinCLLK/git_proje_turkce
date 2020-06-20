package day15methodcreation;

import java.util.Scanner;

public class NewOdevSorusu06 {

	public static void main(String[] args) {
		
		// do_while kullanarak bir oyun tasarlayın
		// bir rakam belirleyelim
		// kullanici bir rakam girsin girdigimiz rakamş bulunca ekrana "kazandiniz" yazsin
		// bulamazsa 3 hak sonra ekrana "kaybettiniz" yazsin
		
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		int hak=3;
		int sayi=7;
		
		
		do {
			
			System.out.println("Bir Rakam girin...:");
			num = scan.nextInt();
			
//			
//			 if(num>sayi){
//				System.out.println("Rakami azaltin");
//				
//			}
//			 else if(num<sayi) {
//				System.out.println("Rakami arttirin");
//				
//			}
			
			 if(num==sayi) {
				System.out.println("Kazandiniz");
				
			}else if(hak==0) {
				System.out.println("Kaybettiniz");
				
			}
			
			
			hak--;
			System.out.println("Kalan hakkiniz...:" + hak);
			
		}while(hak!=0);
		
		

	scan.close();
	}

}
