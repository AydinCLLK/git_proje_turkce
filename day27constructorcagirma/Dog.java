package day27constructorcagirma;

public class Dog extends Mammal {

	public boolean sadik = true;

	public static void main(String[] args) {

		Dog dog = new Dog();
	}

	public void bark() {
		System.out.println("Kopekler havlar ");
	}

	Dog() {
		super();// istege bagli konulabilir
				// this() ayni clastaki paremetresiz constructor cagirmak icin kullanilir
		System.out.println("Dog paremetresiz constructor");
	}

}
