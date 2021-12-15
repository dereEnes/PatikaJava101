
public class Student {
	
	Course c1;
	Course c2;
	Course c3;
	
	String name;
	String stuNo;
	String classes;
	
	double avarage;
	boolean isPass;
	
	public Student(String name, String stuNo, String classes,Course c1,Course c2,Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0.0;
		this.isPass = false;
	}
	
	public void addBulkExamNote(int note1, int note2, int note3,int sozluNotu1,int sozluNotu2,int sozluNotu3) {
		if(note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}
		if(note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if(note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}
		if(sozluNotu1 >= 0 && sozluNotu1 <= 100) {
			this.c1.sozluNotu = sozluNotu1;
		}
		if(sozluNotu2 >= 0 && sozluNotu2 <= 100) {
			this.c2.sozluNotu = sozluNotu2;
		}
		if(sozluNotu3 >= 0 && sozluNotu3 <= 100) {
			this.c3.sozluNotu = sozluNotu3;
		}
	}
	
	public void isPass() {
		
		if(this.avarage >= 55) {
			System.out.println("Ge�ti");
		}else {
			System.out.println("Kald�");
		}
	}
	public void calcAvarage() {
		this.avarage = ((this.c1.note * (1 - this.c1.sozluOrani)) + this.c1.sozluNotu * this.c1.sozluOrani)
				+ ((this.c2.note * (1 - this.c2.sozluOrani)) + this.c2.sozluNotu * this.c2.sozluOrani)
				+((this.c3.note * (1 - this.c3.sozluOrani)) + this.c3.sozluNotu * this.c3.sozluOrani);
		this.avarage = this.avarage / 3 ;
	}
	public void printNote() {
		System.out.println(this.c1.name + " Notu \t:" + c1.note);
		System.out.println(this.c2.name + " Notu \t:" + c2.note);
		System.out.println(this.c3.name + " Notu \t:" + c3.note);
		System.out.println("Ortalaman�z " + this.avarage);
	}
}
