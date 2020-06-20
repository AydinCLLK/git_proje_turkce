package day26encapsulation;

// Inheritance01, Inheritance02'nin parent'i olacak. Yani babasi olacak
// extend ==> uzanmak demek

//            child(cocuk)          parent(baba)
public class Inheritance02 extends Inheritance01 {

	public static void main(String[] args) {

		// Soru 1 : Child'in 1 den fazla parent'i olur mu?
		// Cevap : Olmaz. Java "multiple inheritance" i desteklemez.
		// Java "Single Inheritance" i destekler

		// Soru 2 : Parent'in 1 den fazla child'i olur mu?
		// Cevap : Olur. "Hiyerarsik Inheritance" denir

		// child[a, b] ----> parent[c, d, e] ----> grandParent[f, g]
		// Soru 3 : Child nelere sahip ?
		// Cevap : a, b, c, d, e, f, g
		// Soru 4 : parent nelere sahip?
		// Cevap : c, d, e, f, g
		// Soru 5 : grandparent nelere sahip?
		// Cevap : f, g

	}

}
