package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		
		// substring() methodu bir String'in belli bir bolumunu kesip almak icin kullanilir
		
		String str1 = "Java calisana kolaydir";
		
		
		// substring () 1. versiyon
		System.out.println(str1.substring(5)); // ekrana calisana kolaydir yazdirir. 5 inci indexi gosterir. 5 inci indexi de dahil eder
		
		System.out.println(str1.substring(8)); // ekrana isana kolaydir yazdirir. 8 inci indexi gosterir. 8 inci indexi de dahil eder
												// inclusive ==> dahil demek
		
		System.out.println(str1.substring(22)); // ekranda hicbirsey gorunmez.cunku str 21 degerli
//		System.out.println(str1.substring(23)); // index 23 yok ama ben olmayan bir yerden kesmek istiyorum.
												// Bu bir hatali istekdir. Java Exception verir, yani beni uyarir
												// Hata yapiyorsun der.
		
		System.out.println(str1.substring(0));  // str1.substring(0) = str1 oldugundan substring(0) hic kullanilmaz
		
		
		
		// substring() 2. versiyon
		
		System.out.println(str1.substring(5, 13));  // ilk index dahil ikinci index dahil degildir
													// ilk index ekranda gorunur, ikinci indexi ekranda goremezsiniz
													// ekranda calisana gorunecek
		
		System.out.println(str1.substring(6,12));  // ekranda alisan gorunur.
		
		System.out.println(str1.substring(6,6));  // ekranda hicbirsey yazmaz  str1.substring(6,6) kullanilmaz
		
	//	System.out.println(str1.substring(7,6));  // ekranda hata verir 7 den basla 6 da dur demek hata olur. Exception verir
												  // ilk index kucuk veya esit olmalidir.
		

	}

}
