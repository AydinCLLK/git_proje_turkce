package day20arrays;

public class OdevOutput04 {

	public static void main(String[] args) {
		
		// Program çalıştırıldıktan sonra “i” nin degeri ne olur?

		int[] x = {2, 1, 4, 5, 7};
		
		int limit =3;
		int i = 0;   // 1, 2
		int sum = 0; // 1 + 4
		
		while((sum<limit) && (i<x.length)) {
			i++;
			sum = sum + x[i];
		}
		System.out.println(i); // ekranda 2 yazar

	}

}
