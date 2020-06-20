package day18statickeyword;

public class MyClass {

	int x = 3;
	int y = 5;
	
	MyClass(){
		x += 1;
		System.out.println("-x" + x);  // x = -x4
	}
	
		  //  3
	MyClass(int i){
		this();
		this.y = i;
		x += y;
		System.out.println("-x" + x);  //  x = 7
	}
	      
	     //   4       3
	MyClass(int i, int i2){
		this(3);
		this.x -= 4;
		System.out.println("-x" + x);  //  x = 3
	}
	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass(4,3);
		

	}

}
