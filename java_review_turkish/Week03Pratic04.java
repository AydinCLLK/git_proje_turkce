package java_review_turkish;

public class Week03Pratic04 {

	public static void main(String[] args) {
		
		// integer ve long un max ve min ascii degerlerini bulalim

		System.out.println("Integer Max Deger : " + Integer.MAX_VALUE);
		System.out.println("Integer Min Deger : " + Integer.MIN_VALUE);
		
		System.out.println("Long Max Deger : " + Long.MAX_VALUE);
		System.out.println("Long Min Deger : " + Long.MIN_VALUE);
		
		int maxValue= Integer.MAX_VALUE;
		System.out.println(maxValue);
		
		int minValue= Integer.MIN_VALUE;
		System.out.println(minValue);
		
		
		  int yuksekDeger = 2_147_483_647; //2147483647
	        System.out.println(yuksekDeger + " Alt Cizgili");
//	        int telefon = 5352003030;
	        
	        String tlf = "5352003030";
	        double tfln = 535.200_3030;
	        int dusukDeger = -2_147_483_648;
	        
	        long maxLng = Long.MAX_VALUE; //9223372036854775807
	        System.out.println(maxLng);
	        
	        long tlfLng = 535_200_3030L;
	        System.out.println(tlfLng);
	        
	        long minLng = Long.MIN_VALUE; //-9223372036854775808
	        System.out.println(minLng);
	        
	        long yeniLong = maxLng + minLng;
	        System.out.println(yeniLong);
	}

}
