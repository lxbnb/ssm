package hdgc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.fabric.xmlrpc.base.Data;

import hdgc.bean.Document;
import hdgc.bean.Project;
import hdgc.bean.User;
import hdgc.service.DocumentService;
import hdgc.service.ProjectService;
import hdgc.service.UserService;

@Controller
@RequestMapping("/itProject")
public class ITProjectController {
	@Resource
	private UserService userService;
	@Resource 
	private DocumentService documentService;
	@Resource
	private ProjectService projectService;
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
			System.out.println("user:"+userList.get(0));		
			session.setAttribute("user", userList.get(0));		
			model.addAttribute("useruser", userList.get(0).getRealname());
			return "jsp/loginSubmit";
		}else {
			String msg = "用户名或密码错误";
			model.addAttribute("msg", msg);
			return "login";
		}
		
	}
	/**
	 * 项目管理
	 * @return
	 */
	@RequestMapping("/jihuaxiang")
	public String jihuaxiang(HttpSession session,Model model) {
		User user = (User)session.getAttribute("user");
		List<Project> projectList = projectService.findByUserId(user.getId());
		List<Project> projects = new ArrayList<>();
		if (projectList.size() > 0) {
			for(Project p : projectList) {
				Date date = new Date();
				//相等为0，前者大于后者为1，反之为-1
				if (p.getStarttime().compareTo(date) == 1) {
					projects.add(p);
				}
			}
		}
		model.addAttribute("projects", projects);
		return "jsp/jihuaxiang";
	}
	@RequestMapping("/jixingxiang")
	public String jixingxiang(HttpSession session,Model model) {
		User user = (User)session.getAttribute("user");
		List<Project> projectList = projectService.findByUserId(user.getId());
		List<Project> projects = new ArrayList<>();
		if (projectList.size() > 0) {
			for(Project p : projectList) {
				Date date = new Date();
				//相等为0，前者大于后者为1，反之为-1
				if (date.compareTo(p.getStarttime()) == 1 && date.compareTo(p.getOvertime()) == -1 ) {
					projects.add(p);
				}
			}
		}
		model.addAttribute("projects", projects);
		return "jsp/jixingxiang";
	}
	@RequestMapping("/wanchengxiang")
	public String wanchengxiang(HttpSession session,Model model) {
		User user = (User)session.getAttribute("user");
		List<Project> projectList = projectService.findByUserId(user.getId());
		List<Project> projects = new ArrayList<>();
		if (projectList.size() > 0) {
			for(Project p : projectList) {
				Date date = new Date();
				//相等为0，前者大于后者为1，反之为-1
				if (date.compareTo(p.getOvertime()) == 1) {
					projects.add(p);
				}
			}
		}
		model.addAttribute("projects", projects);
		return "jsp/wanchengxiang";
	}
	/**
	 * 文档管理
	 * @return
	 */
	@RequestMapping("/wendangliulan")
	public String wendangliulan(HttpSession session,Model model) {
		User user = (User)session.getAttribute("user");
		List<Document> documents = documentService.findByUserId(user.getId());
		model.addAttribute("documents", documents);
		return "jsp/wendangliulan";
	}
	/**
	 * 统计分析管理
	 * @return
	 */
	@RequestMapping("/xinagmu")
	public String xinagmu() {
		
		return "jsp/xinagmu";
	}
	
	/**
	 * 后台管理
	 * @return
	 */
	@RequestMapping("/daoru")
	public String daoru() {
		
		return "jsp/daoru";
	}
	@RequestMapping("/daochu")
	public String daochu() {
		
		return "jsp/daochu";
	}
	@RequestMapping("/xiaochushuju")
	public String qingchushuju() {
		
		return "jsp/xiaochushuju";
	}
	@RequestMapping("/daoruSubmit")
	public String daoruSubmit(HttpSession session,String exambatchname,String exambatchbegintime,String exambatchendtime,String projectuser,String examcondition) throws ParseException {
		User user = (User)session.getAttribute("user");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Project project = new Project();
		project.setProjectname(exambatchname);
		project.setStarttime(simpleDateFormat.parse(exambatchbegintime));
		project.setOvertime(simpleDateFormat.parse(exambatchendtime));
		project.setProjectPrincipal(projectuser);
		project.setProjectIntroduction(examcondition);
		project.setUserid(user.getId());
		projectService.add(project);
		
		return "redirect:/itProject/jixingxiang.action";
	}
}
