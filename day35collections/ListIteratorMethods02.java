package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
	
		
		// Elemanlari A , B,C olan bir list olustrunuz 
		// list iterator kullanarak bu elemanlari AW,BW,CW'YE DONUSTURUNUZ 
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String> listIterator = list.listIterator();

		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element+"w");
		}
		System.out.println(list);//[Aw, Bw, Cw]
		
		//list e kemal ve can ekleyin 
		
		list.add("kemal");
		list.add("Can");
		System.out.println(list);//[Aw, Bw, Cw, kemal, Can]

	}

}
