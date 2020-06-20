package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {

		// Bir tane String variable olusturun ve kucuk harflerle bir gun ismini deger
		// olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden birinin ilk harfi ise
		// ekrana hafta ici yazdirin
		// Eger atadiginiz deger hafta sonu gunlerinden birinin ilk harfi ise
		// ekrana hafta sonu yazdirin

		String day = "sali";

		if (day.equals("pazartesi") || day.equals("sali") || day.equals("carsamba") || day.equals("persembe")
				|| day.equals("cuma")) {
			System.out.println("Hafta ici");

		}
		if (day.equals("cumartesi") || day.equals("pazar")) {
			System.out.println("Hafta sonu");
		}

	}

}
