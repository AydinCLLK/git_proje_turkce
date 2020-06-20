package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {

		// 1) Baska bir class'dan urettigimiz object'i object urettigimiz class'da
		// kullanabiliriz.
		// 2) Object'in ozelliklerini degistirebiliriz.Fakat bu degisim sadece o object
		// ile sinirli kalir
		// Yeni uretilecek object'ler bu degisimden etkilenmez.
		// 3) Eger uretilecek her object'in degisime ugramis olmasini istiyorsaniz
		// class'daki ozellikleri degistirmelisiniz

		Constructor01 hondaAraba01 = new Constructor01(); // Constructor01() burda kullanildi olusturulmadi

		System.out.println("Zamli Fiyat : " + (hondaAraba01.price + 1000));
		System.out.println("Year : " + (hondaAraba01.year - 1));
		System.out.println("Make : " + (hondaAraba01.make.replace("Honda", "Toyota")));
		System.out.println("Type : " + (hondaAraba01.type.replace("Civic", "Cmary")));

		Constructor01 hondaAraba02 = new Constructor01();
		System.out.println("Zamli Fiyat : " + hondaAraba02.price);

	}

}
