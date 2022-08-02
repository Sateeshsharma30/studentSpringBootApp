package learn.war.spring.webdisplay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import learn.war.spring.webdisplay.budget.BudgetPlanner;
import learn.war.spring.webdisplay.budget.BudgetService;
import learn.war.spring.webdisplay.user.Users;

@Controller
@RequestMapping("/budget") 
 public class BudgetController {
    
	@Autowired
	private BudgetService bds;

	@RequestMapping(path = "/planner", method = RequestMethod.POST)
	public String userCreate(Model m, @RequestParam String name, @RequestParam String email) {
		
		bds.save(new BudgetPlanner(name, email));

		if (name != null && name.trim().length() > 0 && name.trim().length() <= 15 && email != null
				&& email.trim().length() > 0) {

			m.addAttribute("result", "Successfully Created");

		} else {
			m.addAttribute("result", "Invalid User name or Email ");

		}
		return "userAddResult";
	}

	@RequestMapping(path = "/getAllUsers", produces = "application/json")
	@ResponseBody
	public List<BudgetPlanner> getAllUser(Model m) {
		return bds.getAll();

	}
	
	@RequestMapping(path = "/getAllUsers", produces = "application/json")
	@ResponseBody
	public List<BudgetPlanner> getAllUsers(Model m) {
		return bds.getAll();

}
}
