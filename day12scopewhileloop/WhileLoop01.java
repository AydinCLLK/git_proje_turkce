package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		// while => iken demektir.
		// while I go to school ==> Ben okula gideriken
		// while I go to Uskudar, it rained
		
		int num = 0;
		
		// num4 ten kucuk iken
		while(num<4) {  // Parantez icindeki condition true oldugu surece while loop calisir
			System.out.println("Ali");
			num++;  // Bu satiri unutursaniz while loop sonsuz donguye girer.Unutmayin
		}
		
		// while loop kullanarak 1 den 10 a kadar tamsayilari ekrana yazdirin
		
		int num2=1;
		while(num2<10) {
			System.out.print(num2 + " ");
			num2++;
		}
		System.out.println();
		
		// while loop kullanarak 1 den 20 ye kadar cift tamsayilari ekrana yazdiriniz
		int num3=1;
		while(num3<21) {
			if(num3%2==0) {
				System.out.print(num3 + " ");
			}
			num3++;
		}
		System.out.println();
		
		
		// while loop kullanarak 5 ten 120 e kadar 3 ile bolunebilen tam sayilari yazdiriniz
		int num4=5;
		while(num4<121) {
			if(num4%3==0) {
				System.out.print(num4 +" ");
			}
			num4++;
		}

	}

}
