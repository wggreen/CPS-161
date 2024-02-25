package bookclass;

import java.time.LocalDate;

public class Author {
	private String firstName;
	private String lastName;
	LocalDate birthday;

	public Author(String firstName, String lastName, LocalDate birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}
