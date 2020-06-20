package day05operators;

public class Odev01 {

	public static void main(String[] args) {
		/*
		 *  int numA = 2;
			int numB = 3;
			String str1 = “Çok”
			String str2 = “Çalış”
			Aşağıdaki çıktıları ekrana yazdırmak icin program yazınız.
			
			A) Cok Calis B) 5 Cok C) Calis23 D) Cok1
		 */
		
		
		
		int numA = 2;
		int numB = 3;
		String str1 = "Cok";
		String str2 = "Calis";
		
		System.out.println("A)"+ str1 +" "+ str2);
		System.out.println("B)"+ (numA+numB) + " " + str1 );
		System.out.println("C)"+ str2 + numA + numB );
		System.out.println("D)"+ str1 + (numB-numA));

	}

}
