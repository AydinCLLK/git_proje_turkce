package day19arrays;

public class OutputNedirOrnek05 {

	public static void main(String[] args) {
	
		// Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol
		// eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa
		// “Aynı eleman yok” yazdırınız.
		
		int arr[] = {0,1,2,3,4,5,6,7,8,9,3,5};
		
		int count = 0;
		for(int i=0 ; i<arr.length; i++) {
			for(int a= i+1; a<arr.length; a++) {
				if(arr[i] == arr[a]) {
				count++;
			}
			}
			
		}
		if(count>0) {
			System.out.println(count + " Adet ayni eleman var "  );
			
		}else {
			System.out.println("Ayni eleman yok");
		}

	}

}
