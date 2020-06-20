package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;

	public static void main(String[] args) {

		Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal(15);

	}

	public void feed() {
		System.out.println("Cocuklarini besler");
	}

	Mammal() {
		super();
		// Parent ' daki parameresiz constructor cagirir
		// super() keyword unu kullanmasanizda olur ama bazilari kullanilir sasirmayalim
		// super () kullanilacak sa mutlaka ilk satirda olmalidir
		// super () this () ayni constructorin icinde kullanilamaz
		// cunku ikiside ilk satirda olmalidir

		System.out.println("Mamal paremetresiz constructor");
	}

	public Mammal(int age) {
		super();
		System.out.println("Mamal paremetreli constructor");
	}

}