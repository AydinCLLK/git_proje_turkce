package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {

		// substring() methodu atama yapmadan String'i degistirmez. Degistirmek
		// isteniyorsa atama olmasi lazim
		// orn : String str2 = str1.substring(3);
		StringBuilder str1 = new StringBuilder("animals");
		// str1 = str1.substring(3); yazarsak hata verir. Cunku substring() methodu
		// String Class'indan
		// gelir ve bir String return eder. Halbuki st1 String degil StringBuilder 'dir
		// Java data tipleri uyusmadigindan dolayi atamayi kabul etmez.
		// Bu hatadan kurtulmak icin 2 yol var
		// 1.Yol : String Class'indan yeni bir String uretip atama yapiniz
		String str2 = str1.substring(3);
		System.out.println(str2);
		// 2.Yol : str1.substring(3); ifadesini direkt System.out.println() icerisine
		// yazilir
		System.out.println(str1.substring(3));

		System.out.println(str1.substring(1, 4));// ekranda nim gorunur

		// indexOf() methodu belli bir character'in index'ini return eder.
		System.out.println(str1.indexOf("m")); // ekranda 3 gorunur. Cunku animals da m 3.index'te

		// length() methodu Class'indan gelir ve Stringin uzunlugunu return eder.
		System.out.println(str1.length()); // ekranda 7 gorunur. Cunku animals length'i 7 dir

		// charAt() methodu belli bir index'teki character'i return eder.
		System.out.println(str1.charAt(5));// animals da index'i 5 olan l harfi oldugu icin ekran da l gorunur

		// insert() methodu istenen index'e istenen character'i eklemeye yarar.
		// insert() methodu append gibi StringBuilder'i direkt degistirir.
		str1.insert(0, "X");
		System.out.println(str1); // ekranda Xanimals gorunur

		// delete() methodu istenen index araligindaki character'leri siler
		str1.delete(0, 1);
		System.out.println(str1); // ekranda animals yazar

		// deleteCharAt() methodu istenen index'teki character'i siler
		str1.deleteCharAt(6);
		System.out.println(str1); // ekranda animal yazar

		// reverse() methodu String'i tersten yazdirir.
		str1.reverse();
		System.out.println(str1); // ekranda animal tersi lamina yazar

		// toString() methodu StringBuilder'i String'e cevirmek icin kullanilir
		str1.toString();
		System.out.println(str1); // str1 artik StringBuilder degil String'dir

		// StringBuilder Java'nin 5. versiyonunda olusturuldu
		// StringBuffer'lar StringBuilder'larin eski versiyonudur.StringBuilder'lar daha
		// hizli calisir
		// Bu yuzden StringBuilder kullanmayi tercih ederim

	}

}
