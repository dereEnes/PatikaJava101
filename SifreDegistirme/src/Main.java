import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String userName = "enes", password = "123",inputUserName = "", inputPassword = "";
		String tercih = "",newPassword ="";
				
		System.out.print("kullan�c� ad�n�z ? ");
		inputUserName = scan.nextLine();
		
		System.out.print("�ifreniz ? ");
		inputPassword = scan.nextLine();
		
		if(userName.equals(inputUserName) && password.equals(inputPassword)) {
			System.out.println("Giri� Ba�ar�l�");
		}else {
			System.out.println("Giri� Ba�ar�s�z. �ifrenizi de�i�tirmek ister misiniz? (y/n)");
			tercih = scan.next();
		}
		boolean girisDenemesi = true;
		if(tercih.equals("y")) {
			while(girisDenemesi) {
				System.out.println("L�tfen yeni �ifre giri�i yap�n�z!");
				newPassword = scan.nextLine();
				if(newPassword.equals(password)) {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				}else {
					System.out.println("Ba�ar�l�");
					girisDenemesi = false;
				}
			}
		}else {
			System.out.println("�ifreniz de�i�tirilmeyecek!");
		}
		scan.close();
	}

}
