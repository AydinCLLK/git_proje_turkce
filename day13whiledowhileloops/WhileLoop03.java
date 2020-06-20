package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {

		// 3 un carpim tablosunu ekrana yazdiran programş yazdirin
		// 3x1=3, 3x2=6,.....3x10=30
		System.out.println("For Loop ile cozumu");
		for (int i = 1; i < 11; i++) {
			System.out.print("3x" + i + "=" + (3 * i) + " ");
		}

		System.out.println();
		System.out.println("While Loop ile cozumu");

		int num = 1;
		while (num < 11) {
			System.out.print("3x" + num + "=" + (3 * num) + " ");
			num++;
		}

	}

}
