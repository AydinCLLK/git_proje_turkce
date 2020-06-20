package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// 4 elemanli char bir array olusturun, bu array'e elemanlar yerlestirin
		// Tum elemanlari for dongusu kullanarak ekrana yazdirin
		// sadece son elemani yazdirin

		char arr1[] = new char[4];
		arr1[0] = 'E';
		arr1[1] = 'Y';
		arr1[2] = 'U';
		arr1[3] = 'P';

		for (int i = 0; i < 4; i++) {
			System.out.println(arr1[i]);

		}
		System.out.println(arr1[3]); // ekran da P yazar

		// Array'in length'ini bulmak icin "ArrayIsmi.length" yazmak yeterli
		// Stringlerde de length methodu kullanilir ama String'lerde kullanilan length
		// methodu parantezlidir.
		// Yani Stringlerde==> length() Array'lerde ==> length
		System.out.println(arr1.length); // ekran da 4 yazar

		// Array'deki son elemani yazdirmak icin length kullaniniz
		System.out.println(arr1[arr1.length - 1]); // ekranda P yazar

	}

}
