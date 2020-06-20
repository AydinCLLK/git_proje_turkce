package java_review_turkish;

import java.util.Scanner;

public class Pratic08 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan alinan Dikdörtgenin alanını ve çevresini bulunuz
			//çevre = 2*(boy + en)
			//alan = en * boy
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("En Giriniz...:");
		double en = scan.nextDouble();
		
		System.out.println("Boy Giriniz...:");
		double boy = scan.nextDouble();
		
		System.out.println("Cevresi...:" + 2*(boy + en));
		System.out.println("Alani.....:" + en * boy);
		
		scan.close();

	}

}
