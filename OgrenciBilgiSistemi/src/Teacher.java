
public class Teacher {
	String name;
	String mpNo;
	String branch;
	
	public Teacher(String name,String branch, String mpNo) {
		this.name = name;
		this.branch = branch;
		this.mpNo = mpNo;
	}
	void print() {
		System.out.println("Adý : " + this.name);
		System.out.println("Telefon : " + this.mpNo);
		System.out.println("Bölüm : " + this.branch);
	}
}
