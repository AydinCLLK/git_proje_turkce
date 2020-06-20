package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		// Array'lerde length sabittir degistirilemez
		// ArrayList'lerde (List) length esnektir. Siz eleman ekledikce List length'ini
		// arttirir
		// Siz eleman sildikce List length'ini azaltir.

		// *** int arr[] = {1, 2, 3}; // Array olusturmak bu sekilde

		// List<String> list01 = new List<>(); ==> olmaz
		// ArrayList<String> list01 = new List<>(); ==> olmaz
		// ArrayList<String> list01 = new ArrayList<>(); ==> Bu olabilir ama asagidaki
		// daha cok kullanilir.
		// List<String> list01 = new ArrayList<String>(); ==> Bu da olur ama asagidaki
		// daha cok kullanilir.

		List<String> list01 = new ArrayList<>();
		System.out.println(list01);

		// List'e eleman eklemek icin add() methodu kullanilir.
		list01.add("Ali");
		System.out.println(list01);

		list01.add("Can");
		System.out.println(list01); // ekran da [Ali, Can] ==> once ekleneni one koyar

		// Veli'yi Ali ile Can'in arasina ekleyelim

		list01.add(1, "Veli");
		System.out.println(list01); // ekran da [Ali, Veli, Can]

		// List01'i [Han, Ali, Kemal, Veli, Can, Ayse] bu hale getiriniz

		list01.add(0, "Han");
		list01.add(2, "Kemal");
		list01.add(5, "Ayse");
		System.out.println(list01); // ekran da [Han, Ali, Kemal, Veli, Can, Ayse] cikar

		// list01'in eleman sayisini ekrana yazdirin

		System.out.println("Eleman sayisi : " + list01.size()); // ekranda 6 yazar
	}

}
