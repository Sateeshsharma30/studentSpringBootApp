package learn.war.spring.webdisplay.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService usd; 
	
	@RequestMapping(path = "/userweb", method = RequestMethod.POST)
	public String UserController(Model m,@RequestParam String name,@RequestParam String email) {
		
		m.addAttribute("result", "Successfully Update");
		
		usd.save(new User(name,email));
		return "userAddResult";
		
	}
	
	//getAllUser
	

}
