package day21multidimensionalarray;

public class MultiDimensionalOdev01 {

	public static void main(String[] args) {
		
		// Aşağıdaki multi dimensional array’in tum elemanlarının çarpımını ekrana yazdıran bir program yazınız.
		// { {1,2,3}, {4,5,6} }
		
		int arr[][] = { {1,2,3}, {4,5,6} };
		
		int product = 1;
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				product = product * arr[i][j];
			}
		}
		System.out.println("Sayilarin carpimi = " + product);

	}

}