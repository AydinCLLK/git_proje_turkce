package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		
		// concat() method concatenation yapmanin yani iki String'i birlestirmenin diger yontemidir
		
		String str1 = "Ali";
		String str2 = "Veli";
		
		System.out.println(str1 + str2); // AliVeli
		System.out.println(str1.concat(str2)); // AliVeli -- str1 + str2 ile str1.concat(str2) aynidir.
		
		System.out.println(str1.concat(str2).concat(str1));  // ekranda AliVeliAli yazdirir
															 // concat() i istediginiz kadar pespese kullanabilirsiniz.
		
		System.out.println(str1.concat(" ").concat(str2));  // ekranda Ali Veli gorunur.
															// String'leri birlestirmek icin concat() ile + ayni isi gorur
		
		
		
		// replace() methodu bir characterin butun gorunumlerinin yerine baska character yazmaya yarar
		// orn: ata yerine ana yazmak gibi
		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));  // ekranda ana yaziyor
		System.out.println(str3.replace("a", "o"));  // ekranda oto yaziyor
		System.out.println(str3.replace("x", "y")); //ekranda ata cikar. x olmadigi icin herhangibir degisim yapmaz
		System.out.println(str3.replace("", "y"));  // ekranda yaytyay cikar.
		System.out.println(str3.replace("", "/"));  // ekranda /a/t/a/ yazar
		System.out.println(str3.replace("t", "")); // ekranda aa cikar yani t yi siler.Biz bu yontemi bir characteri
												   // String den silmek icin kullanilir
		System.out.println(str3.replace("a", "")); // ekrana t cikar. butun a characterleri siler
		
		System.out.println(str3.replace("at", "Mustaf")); // ekranda Mustafa cikar. at characterlerini siler yerine Mustaf yazar
		System.out.println(str3.replace("at", "y"));  // ekranda ya cikar . at characterini siler onun yerine y yazar
		
		
		// 2. versiyon
		// replaceFirst() methodu degistirmek istedigimiz characterin sadece ilk gorunumunu degistirir
		String str4="karakartal";
		
		System.out.println(str4.replaceFirst("k", "K"));  // ekranda Karakartal yazar. sadece ilk gorunum buyuk yaptı yani ilk k yerine K yaz
		System.out.println(str4.replaceFirst("a", "e"));  // ekranda kerakartal yazar. yani ilk gorunen a yerine e yaz diyoruz
		System.out.println(str4.replaceFirst("ka", "A")); // ekranda Arakartal yazar. yani ilk gorunen ka yerine A yazar
		System.out.println(str4.replaceFirst("kar", ""));  // ekranda akartal yazar. yani ilk kar'i silmis olduk
		System.out.println(str4.replaceFirst("kara", "A")); // ekranda Akartal yazar. yani ilk kara'yi silmis olduk
		System.out.println(str4.replaceFirst("karakartal", "cimbombom")); // ekranda cimbombom yazar.
		
		
		// Soru
		String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu";
		
		System.out.println(text.replace("Ali", "Veli")); // text icinde ki Ali leri silip yerine Veli yaziyor
		
		
		// replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar.
		// replace() methodunda isterseniz tek harfli character icin tek tirnak kullanilabilir.
		// replaceAll() methodu cift tirnak kullanilir
		
	}

}
