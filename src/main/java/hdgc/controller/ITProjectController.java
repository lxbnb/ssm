package hdgc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hdgc.bean.User;
import hdgc.service.UserService;

@Controller
@RequestMapping("/itProject")
public class ITProjectController {
	@Resource
	private UserService userService;
	@RequestMapping("/regirestSubmit")
	public String regirestSubmit(String username,String password) {
		System.out.println("username:"+username);
		User user = new User();
		user.setUsername(username);
		user.setUserpassword(password);
		user.setUsertypeId(0);
		userService.add(user);
		return "redirect:/login.action";
	}
	@RequestMapping("/loginSubmit")
	public String loginSubmit(String username,String password) {
		List<User> userList = userService.findByNameAndPassword(username, password);
		System.out.println("userlist:"+userList);
		if (userList.size()>0) {
			System.out.println("3333");
			return "jsp/loginSubmit";
		}else {
			return "jsp/loginSubmit";
		}
		
	}
}
