import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double kenar1 = 0,kenar2 = 0,kenar3 = 0,
				u=0,alan = 0;
		System.out.print("1.Kenar uzunlu�u = ");
		kenar1 = scan.nextDouble();
		
		System.out.print("2.Kenar uzunlu�u = ");
		kenar2 = scan.nextDouble();
		
		System.out.print("3.Kenar uzunlu�u = ");
		kenar3 = scan.nextDouble();
		
		u = ( kenar1 + kenar2 + kenar3 ) / 2 ;
		alan =Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
		
		System.out.println("��genin alan� = " + alan);
		scan.close();
	}

}
