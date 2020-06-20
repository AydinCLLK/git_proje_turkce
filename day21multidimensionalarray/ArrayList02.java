package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {

		// List olusturun isim list01 olsun

		// List'ler data type olarak primitive'leri kabul etmez ==> List<int> list01 =
		// new ArrayList<>(); kabul etmedi
		// Primitive'lerde data type ni non-primitive yapmak icin wrapper class'lari
		// kullaniriz. == List<Integer> list01 = new ArrayList<>(); kabul etti
		List<Integer> list01 = new ArrayList<>();

		// Bu list'in icinde eleman olup olmadigini kontrol edin.
		// Bunu icin isEmpty() methodu kullanilir.
		// isEmpty() methodu bos ise true, dolu ise false return eder.
		// isEmpty() ==> Bos mu? anlamina geliyor

		System.out.println(list01.isEmpty()); // ekranda true yazar

		// Bu list'e bir eleman ekleyin
		list01.add(123);
		System.out.println(list01.isEmpty()); // ekran da false yazar

		// List'den eleman silmek. remove() methodu kullanilir. remove()==>
		// uzaklastirmak demek
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		list01.remove(1); // Index'i 1 olan 124'u siler
		System.out.println(list01);

		// 123'u silin

		list01.remove(0);
		System.out.println(list01);

		// List'deki son elemani silin
		list01.remove(list01.size() - 1);
		System.out.println(list01);

	}

}
