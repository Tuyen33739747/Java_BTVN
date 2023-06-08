package Lab_4_3;

public class PartTimeEmployee extends Employee{
    private int hoursPerWeek;

	public PartTimeEmployee(String name, int age, String gender, String employerName, String dateHired,
			int hoursPerWeek) {
		super(name, age, gender, employerName, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + ", getEmployerName()=" + getEmployerName()
				+ ", getDateHired()=" + getDateHired() + ", toString()=" + super.toString() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	

	
	
    
}
