package day11stringmethods;

public class StringMethodOrnekler2 {

	public static void main(String[] args) {
		
		
		
		String str = "Cat, caterpillar";
		System.out.println(str.replace('t', 'm'));  // ekranda  Cam, camerpillar
		System.out.println(str.replace("t", "m"));  // ekranda  Cam, camerpillar
		System.out.println(str.replace("x", "y"));   // ekranda  Cat, caterpillar
		System.out.println(str.replace("", "|"));   // ekranda  |C|a|m|,| |c|a|m|e|r|p|i|l|l|a|r|
		System.out.println(str.replace("a", ""));   // ekranda  Cm, cmerpillr
		System.out.println(str.replace("at", "amel"));  // ekranda  Camel, camelerpillar
		System.out.println(str.replace("at", "e"));    // ekranda  Ce, ceerpillar
		System.out.println(str.replaceFirst("c", "C"));   // ekranda  Cat, Caterpillar
		System.out.println(str.replaceFirst("at", "amel"));  // ekranda  Camel, Caterpillar
		System.out.println(str.replaceFirst("Cat, caterpillar", "Deve"));  // ekranda  Deve
//		
//	//	Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak
//	//	ekran çıktılarına bakın.
		
		String str1 = "900";
		String str2 = "1000";
		int str3 = 900;
		int str4 = 1000;
		System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
		System.out.println(String.valueOf(str3) + String.valueOf(str4));
	
//	//	Integer.valueOf() methodu ile String.valueOf() methodunun farkını açıklayınız.
		// Integer.valueOf() methodu str3 ve str4 u toplayip ekrana 1900 yazar
		// String.valueOf() methodu ise str1 ve str2 yi toplayip ekrana 9001000 olarak yazar String olarak gorur
		
		
	
	}

}
