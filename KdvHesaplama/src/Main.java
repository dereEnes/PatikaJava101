import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float money = 0.0f,fee=0.0f,total= 0.0f;
		
		System.out.print("Para miktarýný giriniz = ");
		money = scan.nextFloat();
		if(money < 0) {
			System.out.println("Lütfen 0 dan büyük para giriniz");
			return;
		}
		if(money<1000) {
			fee = money * 0.18f;
		}else {
			fee = money * 0.08f;
		}
		total = fee + money;
		System.out.print("Toplam Tutar => " + total + "TL  Vergi miktarý => " + fee +"TL");
		scan.close();
				
	}

}
