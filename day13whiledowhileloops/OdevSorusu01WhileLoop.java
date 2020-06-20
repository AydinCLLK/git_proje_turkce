package day13whiledowhileloops;

public class OdevSorusu01WhileLoop {

	public static void main(String[] args) {
		
		// 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		
		int num =8;
		while(num<181) {
			if(num%5==0) {
				System.out.print(num + " - ");
			}
			num++;
		}
		

	}

}
