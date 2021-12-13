package vucutKitleIndexi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Kilo (kg) / Boy(m) * Boy(m)
		Scanner scan = new Scanner(System.in);
		double kilo = 0,boy = 0,index = 0;
		
		System.out.println("Boyunuzu giriniz (metre olarak) :");
		boy = scan.nextDouble();
		
		System.out.println("Kilonuzu giriniz :");
		kilo = scan.nextDouble();
		
		index = kilo / (boy * boy);
		System.out.println("Vücüt kitle indeksiniz : " + index);
		scan.close();
		
	}

}
