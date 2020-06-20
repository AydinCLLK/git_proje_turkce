package day06ifstatement;

public class IfStatement01Kendim {
	
	public static void main(String[] args) {
		
		
		if (3>2) {
			System.out.println("Body Calisti");
			
		}
		
		// Bir int variable olusturun ve ona bir deger atayin
		// Eger atadiginiz deger pozitif ise ekrana pozitif yazdirin
		// Eger atadiginiz deger negatif ise ekrana negatif yazdirin
		
		int deger = 5;
		
		if (deger>0) {
			System.out.println("Pozitif");
		}
		if(deger<0) {
			System.out.println("Negatif");
		}
		if(deger==0) {
			System.out.println("Notr");
		}
		
		
	}

}
