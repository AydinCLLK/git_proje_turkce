package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {

		// Ilk 4 sayma sayisini carpimini veren for loop olusturunuz
		// 1, 2, 3, 4 ==> 1x2x3x4=24

		int product = 1;
		for (int i = 1; i < 5; i++) {
			product = product * i;
		}
		System.out.println("Carpimlari...:" + product);

		// Ilk 6 cift sayma sayisinin carpimini veren for loop olusturunuz

		int product2 = 1;
		for (int i = 2; i < 13; i = i + 2) {
			product2 = product2 * i;
		}
		System.out.println("Carpimlari...:" + product2);

		// **************************************************************************************
		// Interview de sorulur
		// Matematikte 1 er 1 er geri sayim yapip carpmaya faktoriyel denir faktoriyel
		// şsareti(!)
		// 6! = 6 x 5 x 4 x 3 x 2 x 1
		// *************************************************************************************
		// soru: 9! li hesaplayan programi for loop kullanarak yainiz

		int product3 = 1;
		for (int i = 9; i > 0; i--) {
			product3 = product3 * i;
		}
		System.out.println("9!= " + product3);

	}

}
