package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {

		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num < 4);

		// 10 ile 20 arasinda tek sayilari ekrana do-while loop ile yazdirin

		int num2 = 11;
		do {

			System.out.print(num2 + " ");
			num2 = num2 + 2;

//			if(num2%2!=0) {
//				System.out.print(num2 + " ");
//			}
//			num2++;
		} while (num2 < 20);

	}

}
