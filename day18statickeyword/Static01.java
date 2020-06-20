package day18statickeyword;

public class Static01 {
	
	static int en = 12;
	static int boy = 10;
	static int yaricap = 4;
	static double pi;
	static int alan;
	
	// Eger bir variable'in degerini olustururken hesaplama yapmamiz gerekirse
	// "static blok" olusturmak iyidir. Yani; "int alan = en*boy;" demek yerine
	// "static blok" olusturup bu islemleri static blok'un icine yazmak daha iyidir.
	// "static blok" variable'lara deger atamak icin de kullanilabilir.
	
	// static blok class'in icinde butun method'larin (main method dahil) ve constructorlarin
	// disinda olusturulmalidir.
	
	// static blok class olusturuldugu zaman olusturulur.
	
	// static blok tum method'lardan (main method dahil) ve constructorlardan once calistirilir.
	
	// Birden fazla static blok varsa ustteki once calisir
	
	static {
		pi = 3.14;
	}
	
	static {
		alan = en*boy;
	}

	public static void main(String[] args) {
		System.out.println(pi);

	}
	
	// Static class olusturulabilir ama alt classlar (inner class) static class olabilir
	// Ust classlar (outer class) static olamazlar.
	
	static class AltClass {
		
	}
}
