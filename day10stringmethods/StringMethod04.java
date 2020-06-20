package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
		// contains() methodu bir String'in icinde bir characterin olup olmadigini kontrol eder
		// Eger o character String'in icinde varsa true yoksa false return eder
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m"));  // Ekranda false olur cunku karakaltal in icinde "m" yok
												 // contains() methodunun icine her zaman String koyun
		
		System.out.println(str1.contains("kar"));  // Ekranda true olur cunku karakartal in icinde "kara" var
		
		
		// trim() methodu bir String'in bas ve sonundaki bosluklari siler.
		//  Orn: " Ali " ==> "Ali" olur    Orn2 : " Ali Can " ==> "Ali Can" olur
		// trim() methodu sadece bas ve sondaki bosluklari siler, aradaki bosluklara bakmaz
		
		String str2 = " Ali Can      ";
		System.out.println("trim() kullanmadan once :" + str2);
		System.out.println("trim() kullandiktan sonra :" + str2.trim());
		
		
		// isEmpty() methodu bir String'in icinde character olup olmadigina bakar.
		// character yoksa true, varsa false return eder
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty()); // Ekranda false olur. Cunku String bos degil 
		
		String str4 = " ";
		System.out.println(str4.isEmpty()); // Ekranda false olur.Cunku space (bosluk) java icin bir characterdir.
		
		String str5 = "";
		System.out.println(str5.isEmpty());  // Ekranda true verir. Cunku String'te hicbir character yok
		
		// Note : isEmpty() true cikarsa length() 0 demektir.

	}

}
