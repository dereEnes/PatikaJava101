import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String userName = "enes", password = "123",inputUserName = "", inputPassword = "";
		String tercih = "",newPassword ="";
				
		System.out.print("kullanýcý adýnýz ? ");
		inputUserName = scan.nextLine();
		
		System.out.print("Þifreniz ? ");
		inputPassword = scan.nextLine();
		
		if(userName.equals(inputUserName) && password.equals(inputPassword)) {
			System.out.println("Giriþ Baþarýlý");
		}else {
			System.out.println("Giriþ Baþarýsýz. Þifrenizi deðiþtirmek ister misiniz? (y/n)");
			tercih = scan.next();
		}
		boolean girisDenemesi = true;
		if(tercih.equals("y")) {
			while(girisDenemesi) {
				System.out.println("Lütfen yeni þifre giriþi yapýnýz!");
				newPassword = scan.nextLine();
				if(newPassword.equals(password)) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				}else {
					System.out.println("Baþarýlý");
					girisDenemesi = false;
				}
			}
		}else {
			System.out.println("Þifreniz deðiþtirilmeyecek!");
		}
		scan.close();
	}

}
