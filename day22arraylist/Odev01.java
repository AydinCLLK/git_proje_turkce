package day22arraylist;

public class Odev01 {

	public static void main(String[] args) {
		
		// Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		int arr[] = {2, 3, 4, 5};
		int product = 1;
		for(int w : arr) {
			product = product*w;
		}
		System.out.println("Sayilarin carpimi : " + product);
	}

}
