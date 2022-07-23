package learn.war.spring.webdisplay.controller;

import java.beans.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import learn.war.spring.webdisplay.model.Person;

@Controller
public class StudentForm {

	private static Set<String> std = new HashSet<>();

	@RequestMapping(path = "/students", method = RequestMethod.POST)
	public String perents(Model m, @RequestParam String name, @RequestParam String password) {
		if (name != null && name.trim().length() > 0 && name.trim().length() <= 15 && password != null
				&& password.trim().length() >=3 && password.trim().length()<= 15) {
			m.addAttribute("result", "Successfully Update");
		}else {
			m.addAttribute("result", "Invalid User name or password ");

		}
		m.addAttribute(name, name);
		return "userAddResult";
		}
	
	@RequestMapping(path = "/classes")
	public String freind(Model m, @RequestParam String firstName, @RequestParam String lastName,
	@RequestParam String gender, @RequestParam String Class,@RequestParam String dob ,@RequestParam String phone, @RequestParam String City) {
		System.out.println(firstName+lastName+gender+Class+dob+phone+City);
		
		if(firstName != null && lastName != null && firstName.trim().length() > 0 && lastName.trim().length() > 0 && City != null && phone.trim().length()<=10) {
		
			m.addAttribute("result", "Successfully Uploaded ");

		}else {
			m.addAttribute("result", " Invalid details ");

		}
		
		
		return "userAddResult";

	}

}
