import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double kenar1 = 0, kenar2 = 0,hipotenus = 0.0d;
		System.out.print("1.Kenar uzunluðu = ");
		kenar1 = scan.nextDouble();
		System.out.print("2.Kenar uzunluðu = ");
		kenar2 = scan.nextDouble();
		hipotenus = Math.sqrt(Math.pow(kenar1,2) + Math.pow(kenar2,2));
		System.out.println("Hipotenüs uzunluðu => "+hipotenus);
		scan.close();
	}

}
