package registration;

public class Course {
	private String department;
	private String courseName;
	private int maxClassSize;
	private int currentEnrollment;
	private Student[] roster;
	private Faculty instructor;

	public Course(String department, String courseName, int maxClassSize) {
		this.department = department;
		this.courseName = courseName;
		this.maxClassSize = maxClassSize;
		roster = new Student[maxClassSize];
	}

	public String getDepartment() {
		return department;
	}

	public Student[] getRoster() {
		return roster;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getMaxClassSize() {
		return maxClassSize;
	}

	public void setMaxClassSize(int maxClassSize) {
		this.maxClassSize = maxClassSize;
	}

	public int getCurrentEnrollment() {
		return currentEnrollment;
	}

	public void setCurrentEnrollment(int currentEnrollment) {
		this.currentEnrollment = currentEnrollment;
	}

	@Override
	public String toString() {
		return "Course [course Name=" + courseName + ", department=" + department + ", max class size=" + maxClassSize
				+ ", current enrollment=" + currentEnrollment + ", instructor=" + instructor + "]";
	}

	public void assignInstructor(Faculty instructor) {
		String profDepart = instructor.getDepartment();
		if (profDepart == this.department) {
			this.instructor = instructor;
		} else {
			System.out.println("rejected. Departments don't match");
		}
	}

	public void displayRoster() {
		for (int i = 0; i < maxClassSize; i++) {
			System.out.println(roster[i]);
		}
	}

	public void addStudent(Student student) {
		if (currentEnrollment < maxClassSize) {
			boolean rejected = false;
			for (int i = 0; i < maxClassSize; i++) {
				if (roster[i] != null) {
					if ((roster[i].getName() == student.getName()) && (roster[i].getAge() == student.getAge()) && (roster[i].getEmail() == student.getEmail())) {
						System.out.println("rejected. you're in the class already.");
						rejected = true;
						break;
					}
				}
			}
			if (!rejected) {
				roster[currentEnrollment] = student;
				currentEnrollment++;
			}
		} else {
			System.out.println("Rejected. the class is full.");
		}
	}

}
