package day29polymorphismexception;

public class Exeption01 {

	public static void main(String[] args) {
		// Exception: Istisnai hata
		// Temelde kac tur exception var?
		// Temelde iki tur exception var; 1) Compile Time Exception (Checked)
		// 2) Run Time Exception
		// Compile Time Exception'a ornek verebilir misiniz?
		// Tabii ki; 1)FileNotFoundException ==> Dosya bulunamadigi zaman ortaya cikar
		// 2)IOException(Input Output Exception) Input veya Output yapilirken olusan
		// problem-
		// lerde ortaya cikar.
		// Not: FileNotFoundException, IOException'in child'idir.
		// Not: Compile Time Exception'lar mutlaka Handle edilmelidir (Halledilmelidir)
		// Checked Exception'lar iki turlu handle edilir:
		// 1) Method isminden sonra "throws" keyword kullanilir
		// 2) try-catch block kullanilir. try-catch block kullanmak daha iyidir; cunku
		// readable'dir.

		// Exception asl�nda istisna i problem-problem olan istisnalar demek
		// sayi/0 ==> bolme islemi icin istisna bir durum ama problemli istisna
		// temelde 2 t�r exception var.
		// araban�n lasti�i patlad�. ama kenar� �ekip tekerle�i degistirebilirim.
		// yani �stesinden gelebilirim. bunlara handling exception denir.

		// araba �st�ne bir kaplan sald�rsa bag�rabilirsin sadece. buna throwing
		// exception
		// ilan ediyorum. bana kaplan sald�rd�. yard�m isteme

		// compile time exception un di�er ad� checked exception da denir.
		// baz� exceptionlar handler edilmelidr. checked exceptionlar mutlaka
		// handle(tamir) edilmelidir

		// ne tip check exceptionlar var.?
		// 1-) FileNotFoundException: dosya bulunamad� hatas� ne zaman veirlir? dosya
		// bulunamad�g� zaman
		// biri dosyay� silmi� olabilir ben yanl�s yazm�s olabilirm
		// 2-) IOException: input out exception. ne zaman verilir?
		// input i�eri bir�ey almak output d��ar� bir sey vermek. file bulma koduma
		// d�sardan bir sey alak demektir. file almak input faaliyetidir.
		// FileNotFoundException: IOException nun alt k�mesidir.

		// *************Checked exceptionlar nas�l handle edilir?**********
		// iki t�rl� yap�yoruz:
		// 1*) throws yazmak: javaya: "problem varsa yard�m iste demektir."
		// 2-)try-catch blocks. try: dene, catch= yakala demketir.
		// 3-) dene- hata c�karsa -yakala-yapamazsan-bana mesaj at. readable d�r.
		// aradaki fark: try catch �nce dener. olmazsa mesaj atar.
		// ama throw da haz�r mesajlar� ekrana atar problem hakk�nda.
		// try da ayr�nt� ve hatan�n yerini �zetleyen bir mesaj yazar

	}

}
