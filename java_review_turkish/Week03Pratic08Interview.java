package java_review_turkish;

public class Week03Pratic08Interview {

	public static void main(String[] args) {
		
		// Interview Sorusu
		//Iki tane variable'in degerlerini yer degistiriniz
		// sayi1=23, sayi2=54 ==> sayi1=54, sayi2=23 (Bu isleme swap denir)
		
		int sayi1=23;
		int sayi2=54;
		int gecici=0;
		
		gecici = sayi1;
		sayi1=sayi2;
		sayi2=gecici;
		
		System.out.println("sayi1 : " + sayi1);
		System.out.println("sayi2 : " + sayi2);
		
		
		int sayiA=67;
		int sayiB=12;
		
		sayiA = sayiA + sayiB;
		sayiB = sayiA - sayiB;
		sayiA = sayiA - sayiB;
		
		System.out.println("sayiA : " + sayiA);
		System.out.println("sayiB : " + sayiB);
				

		
	}

}
