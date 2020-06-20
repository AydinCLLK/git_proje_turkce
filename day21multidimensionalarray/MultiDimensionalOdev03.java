package day21multidimensionalarray;

public class MultiDimensionalOdev03 {

	public static void main(String[] args) {
		
		// Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını
		// ekrana yazdıran bir program yazınız
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		
		int arr1[][] = { {1,2}, {3,4,5}, {6} };
		int arr2[][] = { {7,8,9}, {10,11}, {12} };
						// 18       28       18  ==> 64 olmasi lazim
		int sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for(int k=0; k<arr2.length;k++) {
					for(int m=0; m<arr2[k].length; m++) {
						if(i==k && j==m) {
							sum = sum + arr1[i][j]+arr2[k][m];
						}
					}
				}
			}
		}
		System.out.println("Ayni index elemanlarinin toplami : " + sum); // ekranda Ayni index elemanlarinin toplami : 64 yazar

	}

}
