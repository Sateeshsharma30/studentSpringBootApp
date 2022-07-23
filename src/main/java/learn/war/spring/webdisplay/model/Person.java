package learn.war.spring.webdisplay.model;

import java.util.Objects;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String place;

	
	public Person() {
		super(); 
	}

	public Person(String firstName, String lastName, int age, String place) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.place = place;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(place, other.place);
	}
	
	

}
