/*
 * 
Dersler : Matematik, Fizik, T�rk�e, Kimya, M�zik
Ge�me Notu : 55
E�er girilen ders notlar� 0 veya 100 aras�nda de�il ise ortalamaya kat�lmas�n.
 */
import java.util.Scanner;

public class Main {
	
	public static int counter = 0;
	public static double total = 0.0d;
	
	public static void check(double sayi) {
		if (sayi >= 0 && sayi <= 100) {
			counter++;
			total += sayi;
		} 
		
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mat,fizik,turkce,kimya,muzik,average;

        System.out.print("Matematik notunuz: ");
        mat = scan.nextDouble();
        check(mat);

        System.out.print("Fizik notunuz: ");
        fizik = scan.nextDouble();
        check(fizik);

        System.out.print("T�rk�e notunuz: ");
        turkce = scan.nextDouble();
        check(turkce);

        System.out.print("Kimya notunuz: ");
        kimya = scan.nextDouble();
        check(kimya);

        System.out.print("M�zik notunuz: ");
        muzik = scan.nextDouble();
        check(muzik);
        
        scan.close();
        
        average = total / counter;

        System.out.println("Averaj notunuz: " + average);

        if (average >= 55) {
            System.out.println("Tebrikler, s�n�f� ge�tiniz!");
        } else {
            System.out.println("S�n�fta kald�n�z.");
        }
    }
}