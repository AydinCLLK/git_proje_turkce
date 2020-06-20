package java_review_turkish;

public class Day02Pratic01 {

	public static void main(String[] args) {
		
		// verilen iki sayının yerlerini değiştiriniz
		
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        
       
       System.out.println("Degisiklik oncesi"); 
       System.out.println("1.sayi...: " + num1);
       System.out.println("2.sayi...:" + num2);
       
       // Ilk once 1.sayi degerini num3(gecici deger) icerisine atiyoruz
       int num3=num1;
       
       // 2.sayi degerini 1.sayi'ya atiyoruz
       num1=num2;
       num2=num3;
       System.out.println("Degisiklik sonrasi");
       System.out.println("1.sayi...:" + num1);
       System.out.println("2.sayi...:" + num2);

	}

}
