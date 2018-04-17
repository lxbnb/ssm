package hdgc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hdgc.bean.Alluser;
import hdgc.bean.Msg;
import hdgc.service.AlluserService;

@Controller
public class LoginController {
	@Autowired
	private AlluserService alluserService;
    @RequestMapping("/login")
    public String login(HttpSession session){
    	Alluser auser=(Alluser) session.getAttribute("user");
		if(auser!=null){
			return "systemlist";
		}
		return "login";
    	
    }
	@ResponseBody
	@RequestMapping("/register")
	public Msg register(@Valid Alluser alluser,BindingResult result,String repassword){
		
		Map<String,Object> map=new HashMap<>();
		List<FieldError> errors=result.getFieldErrors();
		if(errors!=null&&errors.size()>0){
			for(FieldError fe:errors){
				map.put(fe.getField(), fe.getDefaultMessage());
			}
			return Msg.fail().add("name","注册失败").add("errorfields", map);
		}else{
			boolean ishave=alluserService.validateUsername(alluser.getUsername());
			if(ishave){
				return Msg.fail().add("name","注册失败").add("msg", "该用户名已被注册");
			}else{
				if(!repassword.equals(alluser.getPassword())){
					return Msg.fail().add("name","注册失败").add("msg", "两次输入的密码不同");
				}
				alluserService.saveUser(alluser);
				return Msg.success().add("name","注册成功").add("msg", "请到登陆页面登陆");
			}
		}
		
	}
	@RequestMapping("/main")
	public String login(HttpSession session,Alluser user,Model model){
		String message="";
		boolean ishave=alluserService.validateUsername(user.getUsername());
		if(ishave){
			long number=alluserService.validAllUser(user);
			if(number==1L){
				Alluser alluser=alluserService.findByNameAndPassword(user.getUsername(), user.getPassword()).get(0);
				session.setAttribute("user", alluser);
				return "systemlist";
			}else{
				if(number==0L){
					message="账号密码不匹配";
				}else{
					message="有多个相同用户,联系管理员解决";
				}
				model.addAttribute("msg",message);
				return "login";
			}
		}else{
			message="用户不存在";
			model.addAttribute("msg",message);
			return "login";
		}	
	}
	@RequestMapping("/exit")
	public String exit(HttpSession session){
		session.removeAttribute("user");
		session.removeAttribute("system_user");
		session.removeAttribute("company_user");
		return "redirect:/login.action";
	}

}
