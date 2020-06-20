package day18statickeyword;

public class Test02 {
	
	static int i = 1;

	public static void main(String[] args) {
		
		int i = 1;
		for(Test02.i = 1; Test02.i<10 ; Test02.i++) {
			i = i + 2;
			System.out.print(i + " ");
		}

	}

}
