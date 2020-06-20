package day01variables;

public class Variable02 {

	public static void main(String[] args) {

		char harf1 = 'a'; // a nin degeri 97
		char harf2 = 'b'; // b nin degeri 98
		System.out.println(harf1 + harf2); // syso yazip ctrl + space basinca = System.out.println(); cikar
											// cevap 97 + 98 = 195 ekrana cikacak

		System.out.println(harf1); // a
		System.out.println(harf2); // b

		// ab yazdirmak icin asagidaki yontem kullanilabilir
		System.out.print(harf1);
		System.out.println(harf2);

		// bir char'in sayi degeri ASCII tablosu kullanmadan nasil bulunur
		// 'a' degeri = 97 bir tamsayi
		// Data type int olan bir variable olusturup char'i bu variable'a atanir
		int aCharDeger = 'a';
		System.out.println(aCharDeger); // 97

		// '!' , '%&' , '*' sembollerinin ASCII degerlerini bulalim

		int unlemCharDeger = '!';
		System.out.println(unlemCharDeger); // 33

		int yuzdeCharDeger = '%';
		System.out.println(yuzdeCharDeger); // 37

		int asteriksCharDeger = '*';
		System.out.println(asteriksCharDeger); // 42

	}

}
