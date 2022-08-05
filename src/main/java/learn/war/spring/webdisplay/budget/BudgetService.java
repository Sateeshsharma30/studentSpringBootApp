package learn.war.spring.webdisplay.budget;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.war.spring.webdisplay.budgetLedger.Amount;
import learn.war.spring.webdisplay.user.Users;

@Service
public class BudgetService {

	@Autowired
	private BudgetRepos repo;

	public BudgetPlanner save(BudgetPlanner br) {
		return repo.save(br);

	}

	public List<BudgetPlanner> getAll() {
		List<BudgetPlanner> lst = new ArrayList<BudgetPlanner>();
		repo.findAll().forEach(x -> lst.add(x));
		return lst;
	}

	public Amount saves(Amount mt) {
		return repo.save(mt);
	}
	
	
}
