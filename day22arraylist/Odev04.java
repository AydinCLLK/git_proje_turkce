package day22arraylist;

public class Odev04 {

	public static void main(String[] args) {
		// Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya
		// for-each loop kullanarak yazdırınız.
		// İpucu: split()
		
		String str = "Hersey guzel olacak";
		
		for(String w : str.split("")) {
			System.out.println(w);
		}

	}

}
