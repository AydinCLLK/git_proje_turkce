package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// Bir integerin array’in elemanlarini kucukten buyuge diziniz 
		// ve ekrana iki durumu da yazdiriniz

		int arr[] = {2, 11, 0, 23, 7};
		
		System.out.println("Siralamadan once: " + Arrays.toString(arr));
		
		// Arrays.sort() methodu parametre olarak array'in ismi yazilirsa
		// o array'in elemanlari kucukten buyuge (Ascending order, naturel order) siralanmis olur
		Arrays.sort(arr);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr));
		
		// Soru : char'lardan olusan bir array olustrunuz ve "ascending order" yapiniz
		// Char'lar siralanirken Java ASCII kodlari kullanir.
		// Buyuk harflerin ASCII kodlari kucuk harflerden azdir
		// Bu yuzden siralamada buyuk harfler one gecer
		// Java rakamlarin ASCII kodunu o rakamin degeri gibi dusunur
		char arrCh[] = {'a','d','c','b'};
		System.out.println("Siralamadan once: " + Arrays.toString(arrCh));
		
		Arrays.sort(arrCh);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arrCh));
		
		
		// Soru : String'lerden olusan bir array olusturun ve "ascending order" yapin
		
		String arrStr[] = {"Ali","ali","Mehmet","123","Can"};
		System.out.println("Siralamadan once: " + Arrays.toString(arrStr));
		
		Arrays.sort(arrStr);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arrStr));
		
		// Soru : boolean bir array olusturun ascending order yapin
		// boolean icin sort methodu kullanilmaz
		
		
		
		
		
		
		
		
		
		
	}

}
