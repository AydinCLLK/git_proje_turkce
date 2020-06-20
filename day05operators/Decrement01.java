package day05operators;

public class Decrement01 {

	public static void main(String[] args) {
		// int data type'inda bir variable olusturun 
		// Bu variable'nin degerini 3 yontemi de kullanarak her defasinda 1 azaltin
		
		int num1 = 12;
		
		// uzun yol
		
		num1 = num1 - 1;  
		System.out.println(num1); // ekranda 11
		
		// Kisa yol
		num1-=1;
		System.out.println(num1); // ekranda 10
		
		// En Kisa Yol
		num1--;
		System.out.println(num1);  // ekranda 9

	}

}
