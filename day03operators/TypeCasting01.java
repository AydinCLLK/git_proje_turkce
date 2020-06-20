package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		
		byte by1 = 101;
		int sayi1 = by1;  // kucuk data tipini buyuk data tipine cevirmek icin extra bir kod yazmaya
						// gerek yok Java bunu otomatik ( Auto Widening ) olarak yapar.
		
		System.out.println(sayi1); // ekranda 101 geliyor
		
		int sayi2 = 53;
		byte by2 = (byte)sayi2;  // Buyuk data tipini kucuk data tipine cevirmek Java tarafindan yapilmaz
								 //  Ornekteki gibi sag tarafa donusturmek istedigimiz data tipini
								 // Parantez icine yazmaliyiz.
		
		System.out.println(by2);
		
		
		double sayi3 = 23.5;
		int by3 = (int)sayi3;
		System.out.println(by3); // 23 cikiyor ekranda
		
		
		float sayi4 = -23.9f;
		short by4 = (short) sayi4;
		System.out.println(by4); // -23 cikiyor ekranda
		
		
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc = sayi5 / sayi6;
		System.out.println(sonuc);   // ekranda 3.428571428571429 cikiyor
		
		int sonuc2 = (int) (sayi5 / sayi6);
		System.out.println(sonuc2); // ekranda  3 cikiyor
		
		
		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3 = sayi7 /sayi8;
		System.out.println(sonuc3); // Normalde 5/3=1.66666... ama data tipi int yaparsanız
									// sadece tam sayi kismini goruruz...
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		System.out.println(by5);  // Normalde byte'ta (-128....0, 1.....127) 256 sayi var
								  // 255 yazinca 1 tane eksik oldugu icin ekranda -1 cikiyor
								  // 255 i 256 ya boler kalani yazar
		
		
		
				
		

	}

}
