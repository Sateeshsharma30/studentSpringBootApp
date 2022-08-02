package learn.war.spring.webdisplay.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.war.spring.webdisplay.repo.Repo;

@Service
public class UserService {

	@Autowired
	private Repo repo;

	public Users save(Users us) {
		return repo.save(us);

	}

	public List<Users> getAll() {
		List<Users> lst = new ArrayList<Users>();
		repo.findAll().forEach(x -> lst.add(x));
		return lst;
	}
}
