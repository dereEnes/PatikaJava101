import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam = 0;
		double ortalama = 0.0d;
		String durum = "";
		Scanner scan = new Scanner(System.in);
		String[] dersler = new String[]{"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
		int[] dersNotlari = new int[6];
		for(int i = 0; i<dersler.length; i++){
			
			System.out.println(dersler[i]+" notunuzu giriniz : ");
			dersNotlari[i] =  scan.nextInt();
		}
		for (int not : dersNotlari) {
			toplam += not;
		}
		ortalama = (toplam / dersler.length);
		System.out.println("Ortalamanýz =>" + ortalama );
		durum = ortalama > 60 ? "Geçti" : "Kaldý" ;
		System.out.println(durum);
		scan.close();
	}

}

