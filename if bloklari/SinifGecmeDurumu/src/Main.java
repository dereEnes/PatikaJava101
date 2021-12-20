/*
 * 
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eðer girilen ders notlarý 0 veya 100 arasýnda deðil ise ortalamaya katýlmasýn.
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

        System.out.print("Türkçe notunuz: ");
        turkce = scan.nextDouble();
        check(turkce);

        System.out.print("Kimya notunuz: ");
        kimya = scan.nextDouble();
        check(kimya);

        System.out.print("Müzik notunuz: ");
        muzik = scan.nextDouble();
        check(muzik);
        
        scan.close();
        
        average = total / counter;

        System.out.println("Averaj notunuz: " + average);

        if (average >= 55) {
            System.out.println("Tebrikler, sýnýfý geçtiniz!");
        } else {
            System.out.println("Sýnýfta kaldýnýz.");
        }
    }
}