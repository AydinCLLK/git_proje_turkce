package day06ifstatement;

public class IfStatement03Kendim {

	public static void main(String[] args) {
		// Bir char variable olusturun ve bir buyuk harf deger atayin
		// Eger atanan deger haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
		// Eger atanan deger haftanin gunlerinden herhangi birinin ilk harfi degil ise 
		// boyle bir gun yok yazdiracak
		
		char ch = 'A';
		
		if (ch=='P') {
			System.out.println("Pazar, Pazartesi, persembe");
		}
		if (ch=='C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
		}
		if(ch=='S') {
			System.out.println("Sali");
		}
		if(ch!='P' && ch!='C' && ch!='S') {
			System.out.println("Hatali deger girdiniz...");
		}
	}

}
