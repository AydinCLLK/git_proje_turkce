package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exeption02 {

	public static void main(String[] args) throws FileNotFoundException {
		// Checked Exception'lari (Compile Time Exception) handle etmek icin iki yol
		// var;
		// birincisi "throws" keyword'unu kullanmak. Bunu kullanirsaniz console'da
		// teknik mesajlar
		// gorursunuz. Bu yuzden cok tercih edilmez.

		FileInputStream file = new FileInputStream("C:/ogrenci.txt");

	}
}
// 2/si try  catch block kullanmaktir bunu kullanirsaniz consolda teknik mesaj yerine 
//kendi yazdigimiz  mesajlari gorebilirisiniz bu yuzden try -catch kullanmak tercih  edilir 

class ExptionTryCatch {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {

			System.out.println("Dosyanin path'i yanlis veya dosya silinmis olabilir");
		}
	}
}
