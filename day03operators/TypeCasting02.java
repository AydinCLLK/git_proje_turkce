package day03operators;

public class TypeCasting02 {

	public static void main(String[] args) {
		
		
		float num1 = 3.23f;
		double num2 = num1;
		System.out.println(num2);
		
		
		// double 100.235 i int’e çevirip ekrana yazdiriniz.
		
		double num3 = 100.235;
		int num4 =(int) num3;
		System.out.println(num4); //ekranda 100 gosteriyor
		
		
		// int data type’ında oluşturulan 5 sayısı ile double data type’ında oluşturulan
		// 6.2 sayısını toplayıp sonucu ekrana yazdırınız.
		
		int num5 = 5;
		double num6 = 6.2 + num5;
		System.out.println(num6);
		
		
		int num7 = 5/2;
		System.out.println(num7);
		
		float num8 = 5f/2f;
		System.out.println(num8);
		
		double num9 = 5d/2d;
		System.out.println(num9);
		
		
		int sayi1 = 5/3;
		System.out.println(sayi1);
		
		float sayi2 = 5f/3f;
		System.out.println(sayi2);
		
		double sayi3 = 5d/3d;
		System.out.println(sayi3);
		
		
			

	}

}
