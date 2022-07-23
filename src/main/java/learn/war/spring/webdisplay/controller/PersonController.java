package learn.war.spring.webdisplay.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import learn.war.spring.webdisplay.model.Person;

@Controller
public class PersonController {
	private static Set<Person> one = new HashSet();
	
	@RequestMapping(path = "/listUser")
	public String getUsers(Model m) {
		
		m.addAttribute("personList", one);
		
		return "usersList";
	}

	@RequestMapping(path = "/getUsers")
	public String getUserList(Model m, @RequestParam(required = false) String name) {
		List<Person> lst = new ArrayList<>();

		System.out.println(name);
		if (StringUtils.hasText(name)) {
			lst.add(new Person(name, "Sharma", 4, "Vadodara"));
		}
		m.addAttribute("personList", lst);

		if (lst.isEmpty()) {
			return "noUsers";
		} else {
			return "usersList";
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/addUser")
	public String addUser(Model m, @RequestParam String firstName, @RequestParam String lastName,
			@RequestParam Integer age, @RequestParam String place) {
		System.out.println(firstName + lastName + age + place);
		boolean isAdded = one.add(new Person(firstName, lastName, age, place));
		if (isAdded) {
			m.addAttribute("personList", one);
			return "usersList";
		} else {
			m.addAttribute("result", "User is Dublicat");
			return "userAddResult";

		}
		

	}

}
