import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double yaricap = 0,alan = 0,aci = 0;
		
		System.out.print("Yar��ap� giriniz ");
		yaricap = scan.nextDouble();
		
		System.out.print("A��y� giriniz ");
		aci = scan.nextDouble();
		
		alan = (3.14 * Math.pow(yaricap, 2) * aci) / 360;
		System.out.println("Sonuc = " + alan);
		scan.close();
	}

}
