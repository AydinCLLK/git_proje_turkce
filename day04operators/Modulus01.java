package day04operators;

public class Modulus01 {

	public static void main(String[] args) {
		// 12835 sayisinin 23 e bolumunde kalani bulan program yaziniz
		
		System.out.println(12835 % 23); // Hard Coding == Kodun icinde dogrudan sayi kullanmaya denir
										// Kullanimi Hos karsilanmaz..
		int sayi1 = 12835;
		int sayi2 = 23;
		//int sonuc = sayi1%sayi2; ==> sayi1%sayi2 kodu bircok kere kullanilacaksa,
        //variable olusturmak daha iyidir. Ama sadece bir kere kullanacaksaniz variable olusturmaya
        //gerek yok cunku her variable memory de bir yer isgal eder.

		
		System.out.println(sayi1 % sayi2);
		
		
	
	}

}
