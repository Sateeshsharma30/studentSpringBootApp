package learn.war.spring.webdisplay.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.war.spring.webdisplay.repo.Repo;

@Service
public class UserService {

	@Autowired
	private Repo repo;
	
	public UserModel save(UserModel us) {
		return repo.save(us);
		
	}
}
