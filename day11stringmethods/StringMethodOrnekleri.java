package day11stringmethods;

public class StringMethodOrnekleri {

	public static void main(String[] args) {
		
		// 
		
		String str = "Cat, caterpillar";
		System.out.println(str.substring(0));  // ekranda  Cat, caterpillar yazar
		System.out.println(str.substring(3));  // ekranda  , caterpillar yazar
		System.out.println(str.substring(4));  // ekranda   caterpillar yazar ( kelimenin basinda bosluk var)
		System.out.println(str.substring(15));  // ekranda  r yazar
		System.out.println(str.substring(16));   // ekranda  hicbirsey yazmaz
		System.out.println(str.substring(5,8));   // ekranda  cat yazar  ( 5.harf dahil 8.harf dahil degil)
		System.out.println(str.substring(3,4));    // ekranda  ,  yazar  ( 3.harf dahil 4.harf dahil degil)
		System.out.println(str.substring(5,5));    // ekranda  hicbirsey yazmaz  ( 5.harf dahil 5.harf dahil degil)
//		System.out.println(str.substring(8,5));     // ekranda  exception hata mesaji verir
		
//		//Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak
//		//ekran çıktılarına bakın.
		
		System.out.println(str.startsWith("C"));  // true
		System.out.println(str.startsWith("c"));  //false
		System.out.println(str.startsWith("B"));  //false
		System.out.println(str.startsWith("Cat"));  // true
		System.out.println(str.startsWith("c",5));  // true
		System.out.println(str.startsWith("ter",7));  // true
		System.out.println(str.startsWith("p", 11));  // false
		System.out.println(str.startsWith(""));   // true
		System.out.println(str.endsWith("r"));   // true
		System.out.println(str.endsWith("C"));   //false
		System.out.println(str.endsWith(""));   // true
		System.out.println(str.endsWith(" "));   // false
		System.out.println(str.endsWith("lar"));  // true
		System.out.println(str.endsWith("caterpillar"));  // true

	}

}
