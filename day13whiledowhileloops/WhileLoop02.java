package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {

		// while loop kullanarak ilk 5 sayma sayisinin toplamini ekrana yazdirin

		int product = 1;
		int num = 1;
		while (num < 6) {
			product = product * num;
			num++;
		}

		System.out.println(product);
	}

}
