package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {

		// Ternary Operator (If Else If )

		// Kullanicidan bir sayi aliniz
		// Sayi 0 dan buyuk esit ise 10 dan kucuk olupp olmadigini kontrol ediniz
		// 10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif sayi" yazdiriniz
		// Sayi 0 dan kucuk ise ekrana "Negatif sayi" yazdiriniz

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir tamsayi giriniz...:");
		int num = scan.nextInt();

		String result = num >= 0 ? (num < 10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi";

		System.out.println(num + " " + result + "dir");

		scan.close();

	}

}
