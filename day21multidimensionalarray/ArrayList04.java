package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {

		// ["A","C","B","C"] listesini olusturun

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);

		// List'de eleman olarak B var mi?
		System.out.println(list.contains("B")); // Eger B eleman olarak varsa true, yoksa false return eder

		// List'de eleman olarak Z var mi?
		System.out.println(list.contains("Z"));

		// List'deki elemanlari alfabetik siraya koyunuz
		// Collections ==> Bir araya getirilmis parcalar
		// Bir List'deki elemanlari alfabetik siraya (Natural Order) dizmek icin
		// Collections.sort(); methodu kullanilir. Argument olarak list'in adini
		// kullaniniz
		Collections.sort(list);
		System.out.println(list);

	}

}
