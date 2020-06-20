//package day17constructors;
//
//public class Constructors04 {
//
//	int num1 = 12;
//	static int num2 = 22;
//
//	/*
//	 * Static ile ilgili 3 sey 1 ) Static'ler class'a baglidir. Static olmayanlar
//	 * methoda baglidir 2 ) Static methodlarin icerisinde kullandiginiz herseyin
//	 * static olmasi gerekir 3 ) Static birsey degistirdiginizde o class'in butun
//	 * objectleri degisimi gorur ama static olmayani degistirdiginizde object sadece
//	 * kendisinde ki degisimi gorur. Diger objectler gormez
//	 */
//
//	/*
//	 * 1)Baska bir class'dan urettigimiz objecti urettigimiz class'da kullanabiliriz
//	 * 2)Object'in ozelliklerini degistirebiliriz, fakat bu degisim sadece o object
//	 * ile sinirli kalir. Yeni uretilecek olan object'ler bu degisimlerden
//	 * etkilenmez. 3)Eger uretilecek her object'in degisime ugramis olmasini
//	 * istiyorsaniz class'daki ozellikleri degistirmelisiniz.
//	 */
//
//	/*
//	 * Static olmayan variable 'lara instance variable denir Static olan variable
//	 * 'lara class variable denir.
//	 */
//
//	public static void main(String[] args) {
//		// STATİC ILE ALAKALI 2.KURAL BILMEMIZ GEREKEN BILGI
//		// static methodlarin icinde sadece static elemanlar kullanilabilir
//		// num1 static olmadigindan main methodun icinde kullanilamaz
//		// num2 static oldugundan main methodun icinde kullanmamiz problem olmuyor
//		// num1++; // num1++; onundeki commenti kaldirirsaniz Java num1++; nin altini
//		// kirmizi cizer
//		num2++;
//	}
//
//}
