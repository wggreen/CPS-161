package registration;

public class Faculty extends Person {
	private String department;
	private String office;

	public Faculty(String name, int age, String email, String department, String office) {
		super(name, age, email);
		this.department = department;
		this.office = office;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + getName() + ", age=" + getAge() + ", email=" + getEmail() + ", department="
				+ department + ", office=" + office + "]";
	}

}
