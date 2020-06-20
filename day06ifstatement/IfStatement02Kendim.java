package day06ifstatement;

public class IfStatement02Kendim {

	public static void main(String[] args) {
		
		// Bir integer variable olusturun deger atayin
		// Deger cift sayi ise ekrana "cift" yazdirin
		// Deger te sayi ise ekrana "tek" yazdirin
		
		int num = 110;
		if (num%2==0) {
			System.out.println("Cift");
		}
		if (num%2!=0) {
			System.out.println("Tek");
		}

	}

}
