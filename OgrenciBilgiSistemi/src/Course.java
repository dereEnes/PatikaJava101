
public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int sozluNotu;
	double sozluOrani;
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.sozluNotu = 0;
		this.sozluOrani = 0.20;
	}
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		}else {
			System.out.println("Öðretmen ve dersin bölümleri uyuþmuyor");
		}
		
		
	}
	void printTeacher() {
		this.teacher.print();
	}
}
