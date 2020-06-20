package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		
		// valueOf() methodu rakamlarla olusturulan String'leri sayiya donusturur. 
		// Boylece rakamlarla olusturulan String'lerle matematiksel islemler yapabilmemizi saglar.
		
		// valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var.Integer wrapper classinin icinde
		// olan valueOf() methodu String'i integer'a cevirir
		// String'in icindeki valueOf() integer'i String'e cevirir
		
		String paraErkek = "1900";
		String paraKadin = "2000";
		
		// Bu ailenin toplam gelirini bulunuz.
		System.out.println(paraErkek + paraKadin); // ekranda 19002000 gorunur.
		System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin)); // ekranda 3900 olacak
		
		int maasErkek = 1900;
		int maasKadin = 2000;
		
		// maasErkek ve maasKadin sayilarini String'e donusturun ve concation yapin
		
		System.out.println(maasErkek + maasKadin);  // ekranda 3900 cikacak
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadin)); // ekrana 19002000 yazar.
		
	}

}
