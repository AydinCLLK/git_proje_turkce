package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {

		// ["Ali", "Can", "Ayse", "Ali"]

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");
		System.out.println(list);

		list.remove("Ali"); // Birden fazla eleman varsa ilkini siler
		System.out.println(list); // ekranda [Can, Ayse, Ali]

		list.remove("Ali");
		System.out.println(list); // ekranda [Can, Ayse]

		// remove() methodu list'ede olmayan elemanlar icin hata vermez.
		// list'ede olmadigi icin aynisini yazar
		// kemal yok o yuzden silmiyor fakar hata da vermiyor. hic birsey yapmiyor
		// sayiyla yapinca exeption verir. olmayan index i kullanmak her zaman exeption
		// veirr

		list.remove("Kemal");
		System.out.println(list); // ekranda [Can, Ayse]

		// Remove methodun içine sayi yazarsak onu sayi olarak dusunur ama sayi disinda
		// birsey yazarsam onu index olarak dusunmez.
		list.remove(1); // index'i 1 olani sil diyor
		System.out.println(list); // ekranda [Can]

		System.out.println(list.remove("Ali")); // ali olmadigi icin false yazar
												// olan bir elemani silseydi true yazardi

		System.out.println(list.remove(0)); // Bu Can elemanini siler ve ekrana silinen elemani yazar

		list.add("Ayse");
		System.out.println(list); // ekranda [Ayse]

		// "Ayse" elemanini "Aysegul" yapin. set() methodu kullanilir
		// list.set(0, "Aysegul");
		System.out.println(list.set(0, "Aysegul")); // Ayse yani degisimden onceki hali ekrana yazdirir
		System.out.println(list); // ekranda [Aysegul]

		// List'e "Kenan" ve "Zeynep" ekleyin

		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list); // ekranda [Aysegul, Kenan, Zeynep]
		list.clear();
		System.out.println(list.isEmpty()); // ekranda true
		System.out.println(list); // ekranda []

	}

}
