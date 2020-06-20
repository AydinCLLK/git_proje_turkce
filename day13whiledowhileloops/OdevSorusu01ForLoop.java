package day13whiledowhileloops;

public class OdevSorusu01ForLoop {

	public static void main(String[] args) {
		
		// 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		
		
		for (int i= 8; i<181 ; i++) {
			if(i%5==0) {
				System.out.print(i + " - ");
			}
		}

	}

}
