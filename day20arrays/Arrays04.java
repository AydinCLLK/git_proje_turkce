package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {

		// Bir array'in icinde belli bir elemanin var olup olmadigini kontrol ediniz
		// binarySearch() methodu bu is icin kullanilir
		// binarySearch() methodu aranan eleman var oldugun da o elemanin index'ini
		// return eder
		// Onemli Not : binarySearch() methodunu kullanmadan once sort() methodunu
		// kullanmak zorundasiniz
		// aksi takdirde binarySearch() methodu manali bir sonuc vermez. Bazen dogru
		// sonuc verir bazen yanlis sonuc verir

		int arr[] = { 1, 12, 12, 4, 3 };

		// Yukarida verilen array'de 3 eleman olarak var mi?
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3)); // girilen rakamin index'ini ekrana yazar 2 yazar

		// Ayni elemandan birden fazla oldugunda ilkinin index'ini verir.
		System.out.println(Arrays.binarySearch(arr, 12)); // girilen rakamin index'ini ekrana yazar 3 yazar

		// binarySearch() methodu olmayan elemanlar icin negatif sayilar return eder.
		// Negatif olmasi o elemanin arrayde olmadigi anlamina gelir
		// Sayi kismi ise o eleman var olsaydi kacinci eleman olurdu anlamindadir
		System.out.println(Arrays.binarySearch(arr, 5)); // ekrana -4 cikiyor.Cunku 5 var olsaydi
															// 3 ten hemen sonra olurdu {1,2,3,12,12} bu da 4. eleman
															// demektir

	}

}
