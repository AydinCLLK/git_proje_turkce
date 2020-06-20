package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		// startsWith() methodu bir String'in istenen harfle baslayip baslamadigini
		// kontrol eder. Istenen harfle basliyorsa true, istenen harfle baslamiyorsa false return eder.
		
		String str1 = "Ali Can";
		
		// starsWith() 1. versiyon
		System.out.println(str1.startsWith("A")); // ekrana True yazdirir
		System.out.println(str1.startsWith("B")); // ekrana False yazdirir
		System.out.println(str1.startsWith("a")); // ekrana False yazdirir
		
		System.out.println(str1.startsWith("Ali")); // ekrana True yazdirir
		
		
		// starsWith() 2.versiyon
		
		System.out.println(str1.startsWith("a", 3)); // ekrana False yazdirir
		System.out.println(str1.startsWith("a", 5)); // ekrana True yazdirir
		
		System.out.println(str1.startsWith("Can", 4));  // ekrana True yazdirir
		
		
		
		// endsWith() methodu bir String'in istenen harfle bitip bitmedigini
		// kontrol eder. Istenen harfle bitiyorsa true, istenen harfle bitmiyorsa false return eder.
		
		String str2 = "Ayse Canan";
		
		System.out.println(str2.endsWith("n"));  // ekrana True yazdirir
		System.out.println(str2.endsWith("Canan"));  // ekrana True yazdirir
		
		System.out.println(str2.endsWith("CANAN"));  // ekrana false yazdirir
													 
		System.out.println(str2.endsWith(""));     // "" ve " " tamamiyle farklidir. Ikincinin icinde bosluk karakteri var
													 // Birincinin icinde hicbirsey yok. true verir
		
		
		String str3= "Ali ";
		
		System.out.println(str3.endsWith(" "));  // ekranda true yazdirir
		System.out.println(str3.endsWith(""));  // ekranda true yazdirir
		System.out.println(str3.startsWith("")); // ekranda true yazdirir
	}

}
