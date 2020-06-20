package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {

		if (3 > 2) {

			System.out.println("if body calisti...");
		}

		// Bir int variable olusturun ve ona bir deger atayin
		// Eger atadiginiz deger pozitif ise ekrana pozitif yazdirin
		// Eger atadiginiz deger negatif ise ekrana negatif yazdirin

		int num1 = 12;

		if (num1 > 0) {
			System.out.println("Pozitif");
		}
		if (num1 < 0) {
			System.out.println("Negatif");
		}
		if (num1 == 0) {
			System.out.println("Notr");
		}

	}

}
