package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OdevSorusu05 {

	public static void main(String[] args) {
		
		// sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
		// ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		
		System.out.println(list); // ekranda [A, C, E, F]

		// İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
		list.add("B");
		System.out.println(list); // ekranda [A, C, E, F, B]
			
		
		// İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
		list.add(1, "L");
		System.out.println(list); // ekranda [A, L, C, E, F, B]
	
		
		// set() methodu kullanarak, E’yi D yapınız.
		list.set(3, "D");
		System.out.println(list); // ekranda [A, L, C, D, F, B]
		
		
		// remove() methodu kullanarak, F’yi siliniz.
		list.remove(4);
		System.out.println(list); // ekranda [A, L, C, D, B]

		
		// sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
		Collections.sort(list);
		System.out.println(list);// ekranda [A, B, C, D, L]
	}

}
