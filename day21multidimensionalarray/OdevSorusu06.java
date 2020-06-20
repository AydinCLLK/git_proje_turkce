package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OdevSorusu06 {

	public static void main(String[] args) {
		
		// Soru : contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadığını doğrulayınız.
		
		
		// OdevSorusu01
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		
		System.out.println(list); // ekranda [A, C, E, F]

		// OdevSorusu02
		// İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
		list.add("B");
		System.out.println(list); // ekranda [A, C, E, F, B]
			
		// OdevSorusu02
		// İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
		list.add(1, "L");
		System.out.println(list); // ekranda [A, L, C, E, F, B]
	
		// OdevSorusu03
		// set() methodu kullanarak, E’yi D yapınız.
		list.set(3, "D");
		System.out.println(list); // ekranda [A, L, C, D, F, B]
		
		// OdevSorusu04
		// remove() methodu kullanarak, F’yi siliniz.
		list.remove(4);
		System.out.println(list); // ekranda [A, L, C, D, B]

		// OdevSorusu05
		// sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
		Collections.sort(list);
		System.out.println(list);// ekranda [A, B, C, D, L]
		
		// OdevSorusu06
		// Soru : contains() methodu kullanarak, L’nin list’de var oldugunu 
		System.out.println(list.contains("L")); // ekranda true
		
		// ve M’nin list’de var olmadığını doğrulayınız.
		System.out.println(list.contains("M")); // ekranda false
		

	}

}
