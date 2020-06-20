package day17constructors;

public class Constructors02 {

	// Buyume methodu bu class'da degil constructor01 class'inda o yuzden Java kullanmaya musaade etmiyor
	// Bir methodu kullanmak icin o methodun o class'in icinde olmasi lazim
	// Eger baska bir class'taki methodu kullanmak istiyorsaniz o class'tan bir tane object olusturup 
	// O object sayesinde istediginiz methodu kullanabilirsiniz
	
	public static void main(String[] args) {
		
		Constructors01 obj1 = new Constructors01();
		
		// buyume() methodu static oldugundan Java object kullanarak buyume() methodunu 
		// cagirmamizi istemez ve kodun altini sari renkle cizer
		obj1.buyume(33);
		Constructors01.buyume(45);  // ekranda 46
		// buyume() methodu static oldugundan Java object kullanarak buyume() methodunu 
		// cagirmamizi istemez ve kodun altini sari renkle cizer
		obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("Merhaba Naci");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		
		// Bir variable veya method static olarak olusturulmussa, o variable veya methoda
		// object olusturmadan sadece class ismini kullanarak ulasabilirsiniz.
		System.out.println(Constructors03.ad); // ekranda Ali Can yazar
		System.out.println(Constructors03.kilo);  // ekranda 33 yazar
		Constructors03.artirma(45); // 46 yazar
		Constructors03.degistirme("Merhaba Naci"); // ekranda Merhaba Naci yazar
		

	}

}
