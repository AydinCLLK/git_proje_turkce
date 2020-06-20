package day20arrays;

import java.util.Arrays;

public class OdevOutput05 {

	public static void main(String[] args) {
		
		// Program çalıştırıldıktan sonra “x” in elemanları ne olur?
		
		int [] x = {0, 1, 2, 3};
		         
		
		int temp; 
		int i = 0;
		int j = x.length-1;  
		
		while(i<j) {
			
			temp = x[i]; 
			x[i] = x[j]; 
			x[j] = 2* temp; 
			i++;  
			j--;  
		}
		
		System.out.println(Arrays.toString(x));

	}

}
