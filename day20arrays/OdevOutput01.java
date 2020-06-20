package day20arrays;

import java.util.Arrays;

public class OdevOutput01 {

	public static void main(String[] args) {
		
		int arr[] = {2, 1, 7, 6};
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 2)); // Ekran da 1 yazar
		System.out.println(Arrays.binarySearch(arr, 7)); // Ekran da 3 yazar
		System.out.println(Arrays.binarySearch(arr, 3)); // Ekran da -3 yazar
		System.out.println(Arrays.binarySearch(arr, 9)); // Ekran da -5 yazar
		
		
		System.out.println("*****************************************");
		String str[] = {"A", "C", "B", "D"};
		
		Arrays.sort(str);
		System.out.println(Arrays.binarySearch(str, "A")); // Ekran da 0 yazar
		System.out.println(Arrays.binarySearch(str, "C")); // Ekran da 2 yazar
		System.out.println(Arrays.binarySearch(str, "E")); // Ekran da -5 yazar
		System.out.println(Arrays.binarySearch(str, "G")); // Ekran da -5 yazar

	}

}
