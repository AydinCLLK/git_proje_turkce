package day09switchoperator;

public class Switch01Kendim {

	public static void main(String[] args) {
		
		// A harfini bulunca "Ilk harf" , B harfini bulunca "Ikinci harf"
		// C harfini bulunca "Ucuncu harf" , D harfini bulunca "Dorduncu harf"
		// yazdiran programi if else if ve switch() kullanarak yaziniz
		// Digerleri icin "Bilmiyorum"
		
		char ch = 'D';
		
		if (ch=='A') {
			System.out.println("Ilk harf");
		}else if(ch=='B') {
			System.out.println("Ikinci harf");
		}else if(ch=='C') {
			System.out.println("Ucuncu harf");
		}else if(ch=='D') {
			System.out.println("Dorduncu harf");
		}else {
			System.out.println("Bilmiyorum");
		}
		
		switch(ch) {
		
		case 'A':
			System.out.println("Ilk harf");
			break;
		case 'B':
			System.out.println("Ikinci harf");
			break;
		case 'C':
			System.out.println("Ucuncu harf");
			break;
		case 'D':
			System.out.println("Dorduncu harf");
			break;
			default:
				System.out.println("Bilmiyorum");
		}

	}

}
