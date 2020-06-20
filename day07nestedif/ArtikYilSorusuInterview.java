package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// Kullanicidan yil girmesini isteyin
		// girilen yil artik yil ise ekrana "Artik yil" yazdirin
		// girilen yil artik yil degilse ekrana "Artik yil degil" yazdirin

		// artik yil 1) yil 100 e bolunurse 400 e de bolunmeli ==> 1300 artik yil degil
		// cunku 100 e bolundugu halde 400 bolunmuyor
		// ==> 1200 artik yildir cunku 100 e bolunuyor ve 400 e de bolunuyor
		// 2) yil 100 e bolunmezse 4 e bolunmeli

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil girin");
		int yil = scan.nextInt();

		if (yil % 100 == 0 && yil % 400 == 0) {
			System.out.println(yil + " artik Yildir");
		} else if (yil % 100 != 0 && yil % 4 == 0) {
			System.out.println(yil + " artik yildir");
		} else {
			System.out.println(yil + " artik yil degildir");
		}
		scan.close();
	}

}
