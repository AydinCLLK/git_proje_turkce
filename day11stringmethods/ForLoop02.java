package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kucuk 3 un kati olan sayma sayilarini ekrana yan yana yazdiran for
		// loop olusturunuz

		for (int i = 3; i < 100; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Ilk 5 sayma sayisinin toplamini veren programi for loop ile yaziniz

		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		System.out.println("toplam...: " + sum);

		// 10 dan buyuk ilk uc sayma sayisinin toplamini veren for loop yaziniz
		int sum2 = 0;
		for (int i = 11; i < 14; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("toplam...: " + sum2);

		// 20 den buyuk ilk 5 sayma sayisiin toplamini veren for loop yaziniz

		int sum3 = 0;
		for (int i = 21; i < 26; i++) {
			sum3 = sum3 + i;
		}
		System.out.println("Toplamlari...:" + sum3);

		// ilk 50 sayma sayisinin toplamini veren for loop olusturunuz
		int sum4 = 0;
		for (int i = 1; i < 51; i++) {
			sum4 = sum4 + i;
		}
		System.out.println("toplamlari...:" + sum4);

		// 5 ile bolunebilen 100 den kucuk sayma sayilarinin toplamini veren for loop
		// olusturunuz

		int sum5 = 0;
		for (int i = 5; i < 100; i = i + 5) {
			sum5 = sum5 + i;
		}
		System.out.println("Toplamlari...:" + sum5);
	}

}
