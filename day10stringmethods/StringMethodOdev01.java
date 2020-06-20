package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu
		// rakamlarını ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kredi karti numarasi girin...:");
		String kart = scan.nextLine();
		int lenght = kart.length();
		
		System.out.println(kart.charAt(2));
		System.out.println(kart.charAt(3));
		System.out.println(kart.charAt(lenght - 1));
		
		scan.close();

	}

}
