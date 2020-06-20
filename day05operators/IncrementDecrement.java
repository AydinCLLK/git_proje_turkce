package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data type'inda bir variable olusturun 
		// Bu variable'in de degerini carpma ve bolme kullanarak
		// arttirin ve azaltin
		
		int num1 = 12;
		
		// Uzun yol carpma yaparak increment
		num1 = num1 * 3;
		System.out.println(num1);
		
		// Kisa yol
		num1*=3;
		System.out.println(num1);
		
		
		// Uzun Yol Bolme yaparak decrement
		num1 = num1 /9;
		System.out.println(num1);
		
		// kisa yol
		
		num1/=2;
		System.out.println(num1);

	}

}
