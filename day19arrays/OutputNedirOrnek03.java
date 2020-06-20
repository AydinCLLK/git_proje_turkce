package day19arrays;

public class OutputNedirOrnek03 {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		if(arr1==arr2) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");  
		}
		
	/*	Ekranda
		 
		Not same   gormus oluruz

		Cunku degerler ayni olsa bile reference yani
		depolama adresleri farkli  
	*/
	}

}
