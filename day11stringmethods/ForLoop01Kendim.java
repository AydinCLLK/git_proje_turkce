package day11stringmethods;

public class ForLoop01Kendim {

	public static void main(String[] args) {
		
		// 6, 5, 4, 3, 2, 1, 0, -1 yi ekrana yazdiran forloop olusturunuz

		for(int i=6; i>-2; i--) {
			System.out.print(i + " ");
		}
		
		// 3, 4, 5, 6, 7 sayilarini ekrana yazdiran for loop olusturunuz
		
		System.out.println();
		for (int i=3; i<8; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// ilk 100 sayma sayisini 1 den 100 e ekrana yanyana yazdiran ve aralarina bosluk koyan programi forloop kullanarak yaziniz
		
		for(int i=1; i<100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// ilk 100 sayma sayisini 100 den 1 e kadar ekrana yanyana yazdiran ve aralarina bosluk koyan programi forloop kullanarak yaziniz
		for(int i=100; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// ilk 50 cift sayma sayisini ekrana yan yana yazdiran for loop olusturunuz
		// 2, 4, 6,.....100
		for(int i=2; i<101; i=i+2) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		// ilk 50 tek sayma sayisini ekrana yan yana yazdiran for loop olusturunuz
		// 1, 3, 5,.....99
		for(int i=1; i<100; i=i+2) {
			System.out.print(i +" ");
		}
		
	}

}
