package learn.war.spring.webdisplay.budget;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.war.spring.webdisplay.budgetLedger.Amount;

@Repository
public interface BudgetRepos extends CrudRepository<BudgetPlanner, Integer>{

	Amount save(Amount mt);

}
