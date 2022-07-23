package learn.war.spring.webdisplay.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
