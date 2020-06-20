package java_review_turkish;

public class Day02Pratic02 {

	public static void main(String[] args) {
		
		/* ***interview question***
		 * 
	       // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
	     */   
		
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
		
		System.out.println("degistirmeden once");
		System.out.println("1.sayi...:" + x);
		System.out.println("2.sayi...:" + y);
		
		x= y + x;
		y = x - y;
		x = x - y;
		
		System.out.println("degistirmeden sonra");
		System.out.println("1.sayi...:" + x);
		System.out.println("2.sayi...:" + y);

	}

}
