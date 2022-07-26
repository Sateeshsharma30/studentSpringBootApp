package learn.war.spring.webdisplay.controller;

import java.util.Date;
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
import learn.war.spring.webdisplay.budgetLedger.Amount;

@Controller
@RequestMapping("/Accounts")
public class BudgetLedgerController {
	
	@Autowired
	private BudgetService service;
	
	@RequestMapping(path = "/ledgerbudget", method = RequestMethod.POST)
	public String usercreate(Model m, @RequestParam String name, @RequestParam String type,
			@RequestParam Integer amount, @RequestParam Date date) {
		
		service.saves(new Amount(name,type,amount,date));

		if ( name != null && name.trim().length() > 0 && name.trim().length() <= 15 && amount != null && date != null && type != null) {

			m.addAttribute("result", "Successfully Created");

		} else {
			m.addAttribute("result", "Invalid data");

		}
		return "userAddResult";
	
}

	
	
	
	
}
