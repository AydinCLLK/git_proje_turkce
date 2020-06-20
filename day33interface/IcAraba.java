package day33interface;

public interface IcAraba {

	int price = 2000;
	boolean old = true;

	public abstract void direksiyon();

	public void koltuk();

	abstract void klima();

// default koyunca concreat method olmus oldu bunu override yapmaya gerek yok 
	public default void doseme() {
		System.out.println("interface 'de default keyword ile doseme yapmatim");

	}
// public default void isitma(); default keyword yazildiysa body koymak lazim yoksa java sikayet eder CTE aliriz 

	public static void isitma() {
		System.out.println("interface 'de static keyword ile isitma yapmatim");
	}

}
