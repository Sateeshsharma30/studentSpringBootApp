package learn.war.spring.webdisplay.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
	private static HashMap<String, Set<String>> tds = new HashMap<>();

	@RequestMapping(path = "/toAdd", method = RequestMethod.POST)
	public String toDoList(Model m, @RequestParam String name, @RequestParam List<String> todo) throws Exception {

		HashSet<String> set = new HashSet<String>(todo);
		m.addAttribute("result", "Successfully Update");
		set.removeIf(x -> !StringUtils.hasText(x));

		Set<String> existing = tds.get(name);
		if (existing == null || existing.isEmpty()) {
			tds.put(name, set);

		} else {
			existing.addAll(set);
			tds.put(name, existing);

		}
		System.out.println(tds);
		return "userAddResult";

	}

	@RequestMapping(path = "/todoGet", method = RequestMethod.GET)
	public String todoGet(Model m, @RequestParam String name) {

		System.out.println("getting value for key-" + name + " and value is -" + tds.get(name));
		Set<String> th = tds.get(name);
		m.addAttribute("todoSet", th);
		m.addAttribute("todoUserName", name);
		return "todoList";

	}

	@RequestMapping(path = "/todoDelete", method = RequestMethod.DELETE)
	@ResponseBody
	public String todoDelete(Model m, @RequestParam String userName) {

		Set x = tds.remove(userName);
		if (x == null) {
			return "Not found";
		} else
			return "Deleted Successfully";

	}
}
