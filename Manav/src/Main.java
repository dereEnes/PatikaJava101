import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//miktarlar
		double armutMiktar = 0, 
				elmaMiktar = 0,
				domatesMiktar = 0,
				muzMiktar = 0,
				patlicanMiktar = 0,
				toplam = 0;
		//fiyatlar
		double armutFiyat = 2.14, 
				elmaFiyat = 3.67, 
				domatesFiyat = 1.11, 
				muzFiyat = 0.95,
				patlicanFiyat = 5.0;
		
		System.out.print("Armut Ka� Kilo ? :");
		armutMiktar = scan.nextDouble();
		
		System.out.print("elma Ka� Kilo ? :");
		elmaMiktar = scan.nextDouble();
		
		System.out.print("domates Ka� Kilo ? :");
		domatesMiktar = scan.nextDouble();
		
		System.out.print("muz Ka� Kilo ? :");
		muzMiktar = scan.nextDouble();
		
		System.out.print("patlican Ka� Kilo ? :");
		patlicanMiktar = scan.nextDouble();
		
		toplam = armutMiktar * armutFiyat +
				elmaFiyat * elmaMiktar +
				domatesFiyat * domatesMiktar + 
				muzFiyat * muzMiktar + 
				patlicanFiyat * patlicanMiktar;
		
		String sonuc = String.format("%.2f", toplam);
		System.out.println("�demeniz gerek Fiyat => " + sonuc + " TL");
		scan.close();
	}

}
