package day21multidimensionalarray;

public class MultiDimensionalOdev02 {

	public static void main(String[] args) {
		
		// Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını ekrana yazdıran
		// bir program yazınız { {1,2,3}, {4,5}, {6} }
		
		int arr[][] = { {1,2,3}, {4,5}, {6} };
		
	//	System.out.println(arr[0][1] * arr[1][1] * arr[2][0] );
		System.out.println(arr[0][2]*arr[1][1]*arr[2][0]);

	}

}
