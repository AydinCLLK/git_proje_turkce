package java_review_turkish;

import java.util.Random;

public class Day02Pratic03 {

	public static void main(String[] args) {
		
		//0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?	
		//random sayi= 185  toplamları = 14
		
		// 1.YOL
		int randomSayi = (int)(Math.random()*1000); // 0 ile 1000 arasi sayi uretir.1000 vermez
	//		int randomSayi = (int)(Math.random()*10)+10; // 10 ile 20 arasi sayi uretir. 20 vermez
		
		// 2.YOL
//		Random randomSayi=new Random();
//		int sayi = randomSayi.nextInt(1000);
//		
//		System.out.println(sayi);
		
		System.out.println("Random sayi...:" + randomSayi);
		
		
//		int yuzler = randomSayi/100;
//        int onlar = randomSayi/10%10;
//        int birler = randomSayi%10;
		
		int birler = randomSayi%10; // birler basamagi
		randomSayi = randomSayi/10;
		
		int onlar = randomSayi%10; // onlar basamagi
		int yuzler = randomSayi/10; // yuzler basamagi
		
		randomSayi = Math.abs(randomSayi);
		System.out.println("Sayilarin toplami...:" + (birler+onlar+yuzler));
		
		

	}

}
