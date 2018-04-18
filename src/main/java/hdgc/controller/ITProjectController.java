package hdgc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String loginSubmit(String username,String password,HttpSession session,Model model) {
		List<User> userList = userService.findByNameAndPassword(username, password);
		System.out.println("userlist:"+userList);
		if (userList.size()>0) {
			System.out.println("3333");
			session.setAttribute("user", userList.get(0));
			return "jsp/loginSubmit";
		}else {
			String msg = "用户名或密码错误";
			model.addAttribute("msg", msg);
			return "login";
		}
		
	}
}
