package day01variables;

public class Variable01 {
	public static void main(String[] args) {
		int maas = 3000;
		char harf = 'S'; // charlara deger atamasi yaparken mutlaka tek tirnak kullanilir

		System.out.println(maas);
		System.out.println(harf);

		int sayi = 123;
		System.out.println(sayi);

		boolean isOld = true; // boolean larda true yada false yazılır.
		System.out.println(isOld); // true

		boolean isNew = false;
		System.out.println(isNew); // false

		byte derinlik = -123; // -128 den 127 arasi sayi icin kullanilir kucuk sayilar icin kullanilir. yaslar
								
		System.out.println(derinlik);

		short sirnakNufus = 28000; // buyuk sayilar icin kullanilir. orn : koy nufuslari icin
		System.out.println(sirnakNufus); // ekranda 28000

		long hucreSayisi = 123456789123456789l; // integer sinirini asan long variable'larda en sona "l" le veya "L"
												// harfi koymalıyız.
		System.out.println(hucreSayisi); // ekranda 1234567

		double pi = 3.14567895365674; // Java butun ondalik kesirleri otomatik olarak double kabul eder
										// değer vermezsek default value (ekran ciktisi) = 0.0
		System.out.println(pi);

		float para = 5.25f; // eger bir ondalik kesri float yapmak istersek sonuna "f" veya "F" koymamız
							// lazım
		System.out.println(para);

		String ogrenciIsmi = "Ali Can";
		System.out.println(ogrenciIsmi);

	}
}
