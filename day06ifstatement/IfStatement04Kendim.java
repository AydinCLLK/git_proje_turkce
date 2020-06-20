package day06ifstatement;

public class IfStatement04Kendim {

	public static void main(String[] args) {
		// Bir tane String variable olusturun ve kucuk harflerle bir gun ismini deger olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden birinin ilk harfi ise
		// ekrana hafta ici yazdirin
		// Eger atadiginiz deger hafta sonu gunlerinden birinin ilk harfi ise
		// ekrana hafta sonu yazdirin
		
		String gun ="cuma";
		if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
			System.out.println("Hafta ici");
		}
		if(gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("Hafta Sonu");
		}
		

	}

}
