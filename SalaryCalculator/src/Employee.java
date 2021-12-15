import java.util.Date;

public class Employee {
	String name;
	float salary;
	float workHours;
	int hireYear;
	
	public Employee(String name,float salary, float workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours ;
		this.hireYear = hireYear;
	}
	double tax() {
		if(this.salary > 1000) {
			return this.salary * 0.03;
		}else {
			return 0.0;
		}
	}
	double bonus() {
		if(this.workHours > 40) {
			return ( this.workHours - 40 ) * 30;
			
		}else {
			return 0.0;
		}
	}
	double raiseSalary() {
		Date d = new Date();
		int calisilanYil = d.getYear() - this.hireYear;
		if(calisilanYil <= 10) {
			this.salary *= 1.05;
		}else if(calisilanYil < 20 && calisilanYil > 10) {
			this.salary *= 1.1;
		}else {
			this.salary *= 1.15;
		}
		 return this.salary;
	}
	double calculateTotal() {
		return ( this.bonus()+this.salary - this.tax());
	}
	
	public String toString() {
		return "Adý : " +this.name 
				+ "\nMaaþý : " + this.salary
				+ "\nÇalýþma Saati : " + this.workHours
				+ "\nBaþlangýç yýlý : " + this.hireYear
				+ "\nVergi :" + this.tax()
				+ "\nBonus : " + this.bonus()
				+ "\nMaaþ Artýþý : " + this.raiseSalary()
				+ "\nVergi ve Bonuslar ile Maaþ : " + calculateTotal()
				+ "\nToplam : " + calculateTotal();
	}
}
