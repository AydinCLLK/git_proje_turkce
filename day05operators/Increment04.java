package day05operators;

public class Increment04 {

	public static void main(String[] args) {
		// int data type'inda bir tane variable olusturun
		// Bu variable'i her seferinde 1 arttirmak icin 3 yontemi de kulanin
		
		// 1. Yol --- UZUN YOL
		int sayi1 = 12;
		sayi1 = sayi1 + 1;
		System.out.println(sayi1);
		
		
		// 2.YOL
		int sayi2 = 15;
		sayi2+=1;
		System.out.println(sayi2);
				
		
		// 3.Yol --- EN KISA YOL
		int sayi3 = 20;
		sayi3++;
		System.out.println(sayi3);

	}

}
