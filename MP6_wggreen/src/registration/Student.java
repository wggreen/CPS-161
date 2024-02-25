package registration;

public class Student extends Person {
	private String major;
	private double gpa;

	public Student(String name, int age, String email, String major, double gpa) {
		super(name, age, email);
		this.major = major;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", age=" + getAge() + ", email)=" + getEmail() + ", major=" + major
				+ ", gpa=" + gpa + "]";
	}
	
	public void registerCourse(Course course) {
		course.addStudent(this);
	}

}
