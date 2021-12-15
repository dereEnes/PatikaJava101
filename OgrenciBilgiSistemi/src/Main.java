
public class Main {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Mahmut Hoca","TRH","555");
		Teacher t2 = new Teacher("Enes Dere","FZK","333");
		Teacher t3 = new Teacher("Kül yutmaz","BIO","222");
		
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);
		
		Course biyoloji = new Course("Biyoloji", "103", "BIO");
		biyoloji.addTeacher(t3);
		
		Student s1 = new Student("inek þaban", "123", "4", tarih, fizik, biyoloji);
		s1.addBulkExamNote(100, 50, 100, 50, 100, 50);
		s1.calcAvarage();
		s1.isPass();
		s1.printNote();
		
	}
}
