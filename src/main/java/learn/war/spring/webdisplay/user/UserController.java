package learn.war.spring.webdisplay.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService usd; 
	
	@RequestMapping(path = "/userweb", method = RequestMethod.POST)
	public String createUser(Model m,@RequestParam String name,@RequestParam String email) {
	
		
		if (name != null && name.trim().length() > 0 && name.trim().length() <= 15 && email != null
				&& email.trim().length() >0) {
			
			m.addAttribute("result", "Successfully Update");

		} else {
			m.addAttribute("result", "Invalid User name or password ");

		}
		
		usd.save(new Users(name,email));
		return "userAddResult";
		
	}
	
	@RequestMapping(path = "/getAllUser", produces = "application/json")
	@ResponseBody
	public List<Users> getAllUser(Model m) {		 
		return usd.getAll();
		
	}
	

}
