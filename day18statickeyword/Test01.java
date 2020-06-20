package day18statickeyword;

public class Test01 {

	public static void main(String[] args) {
		
		int x = 20;
		System.out.println(x);

	}
	static {      //  static blok main methodan once calisir onun icin ekranda ilk once 10 gorunur
		int x = 10;
		System.out.println(x + " ");
	}

}
