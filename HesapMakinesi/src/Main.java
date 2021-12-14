import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double number1 = 0, number2 = 0, sonuc =0;
		int islem = 0;
		System.out.print("1.Sayýyý girin : ");
		number1 = scan.nextDouble();
		
		System.out.print("2.Sayýyý girin : ");
		number2 = scan.nextDouble();
		
		System.out.print("Ýþlem Seçiniz : \n 1-Toplama 2-Çýkarma 3-Çarpma 4-Bölme : ");
		islem = scan.nextInt();
		scan.close();
		
		switch(islem) {
			case 1:
				sonuc = number1 + number2;
				break;
			case 2:
				sonuc = number1 - number2;
				break;
			case 3:
				sonuc = number1 * number2;
				break;
			case 4:
				sonuc = number1 / number2;
				break;
			default:
				System.out.println("Lütfen 1-4 arasý bir sayý giriniz!");
				break;
		}
		if(sonuc > 0 && sonuc < 5) System.out.println("Sonuc = " + sonuc);
		
		
		
	}

}
