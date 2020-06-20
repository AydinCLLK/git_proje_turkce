package day22arraylist;

public class Odev03 {

	public static void main(String[] args) {
		// İki String array oluşturunuz ve bu array’lerdeki ortak elemanları
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız
		
		String arr1[] = {"Ali", "Veli", "Can"};
		String arr2[] = {"Ali", "Kemal", "Can"};

		int count = 0;
		
		for(String w : arr1) {
			for(String z : arr2) {
				if(w.equals(z)) {
					System.out.println(w + " ile " + z +" ortak elemanlardir");
					count++;
				}
			}
		}
		if(count==0) {
			System.out.println("Ortak eleman yok");
		}
			
		
	}

}
