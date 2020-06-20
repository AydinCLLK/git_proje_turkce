package day23date;

import java.util.ArrayList;
import java.util.List;

public class AlistirmaListAllMethod {

	public static void main(String[] args) {
		// adAll() methodu iki listi birlestirmek icin kullanilir
		// index kullanmadan adAll() kullanirsaniz ya bas tarafa veya son tarafa ekleme yaparsiniz
		// Fakat index kullanarak addAll() kullanirsaniz list'i istediginiz index'e ekleyebilirsiniz
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(4);
		
		list.addAll(list2);
		System.out.println(list); // Burda list ve list2'yi birlestirmis oldu
		
		list2.addAll(list);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		
		list2.addAll(1, list3);
		System.out.println(list2);
		

	}

}
