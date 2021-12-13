import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double kilometreFiyati = 2.20; 
		double mesafe = 0,tutar = 0;
		
		System.out.print("Mesafeyi giriniz => ");
		mesafe = scan.nextDouble();
		
		tutar = mesafe * kilometreFiyati;
		tutar += 10;
		
		if(tutar < 20) {
			tutar = 20;
		}
		System.out.println("Ödenecek Miktar => " + tutar);
		scan.close();
	}

}
