package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {

		// Kullanicinin girdigi 4 basamakli sayisinin ilk ve son rakaminin toplamini
		// veren programi yaziniz
		// Soruda modulus kullan demiyor ama cozum icin modulus kullanacagiz

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 4 basamakli bir tamsayi giriniz...");

		int s = scan.nextInt();
		int sonRakam = s % 10; // bir tam sayinin birler basamagini bulmak icin sayiyi 10 a boleriz
		int ilkRakam = s / 1000;

		System.out.println(sonRakam + ilkRakam);

		scan.close();

	}

}
