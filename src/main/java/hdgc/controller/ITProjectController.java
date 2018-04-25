package hdgc.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
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
	@RequestMapping("/xiangmu")
	public String xinagmu(HttpSession session,Model model) {
		User user = (User)session.getAttribute("user");
		List<Project> projects = projectService.findByUserId(user.getId());
		model.addAttribute("num",projects.size());
		int i = 0;
		if (projects.size() > 0) {
			for(Project p : projects) {
				Date date = new Date();
				//相等为0，前者大于后者为1，反之为-1
				if (date.compareTo(p.getStarttime()) == 1 && date.compareTo(p.getOvertime()) == -1 ) {
					i++;
				}
			}
		}
		model.addAttribute("daiwancheng", i);
		return "jsp/xiangmu";
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
	public String daochu(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException {
		User user = (User)session.getAttribute("user");
		List<Project> projects = projectService.findByAll();
		String path = request.getServletContext().getRealPath("/");
		com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			PdfWriter.getInstance(document, baos);
			document.open();
			BaseFont bfChinese = BaseFont.createFont(path
					+ "fonts/AdobeKaitiStd-Regular.otf", BaseFont.IDENTITY_H,
					BaseFont.NOT_EMBEDDED);
			Font font1 = new Font(bfChinese, 20, Font.BOLD);
			Font font2 = new Font(bfChinese, 13, Font.NORMAL);
			Font font3 = new Font(bfChinese, 14, Font.BOLD);
			Font font4 = new Font(bfChinese, 12, Font.NORMAL);
			Font font5 = new Font(bfChinese, 11, Font.NORMAL);
			//准考证存根，监考老师保留
			Paragraph title2 = new Paragraph("项目导出目录", font1);
			title2.setAlignment(1);
			document.add(title2);
			float[] cellsWidth2 = { 120, 280};
			PdfPTable datatable2 = new PdfPTable(2);
			datatable2.setSpacingBefore(10);
			datatable2.setTotalWidth(cellsWidth2);
			datatable2.setLockedWidth(true);
			datatable2.setHorizontalAlignment(Element.ALIGN_CENTER);
			for(int i = 0 ; i < projects.size(); i++) {
				if (i != 0) {
					document.newPage();
				}
				PdfPCell cell21 = new PdfPCell(new Paragraph("项目名称", font2));
				PdfPCell cell22 = new PdfPCell(new Paragraph(projects.get(i).getProjectname(), font2));
				PdfPCell cell31 = new PdfPCell(new Paragraph("项目负责人", font2));
				PdfPCell cell32 = new PdfPCell(new Paragraph(projects.get(i).getProjectPrincipal(), font2));
				PdfPCell cell41 = new PdfPCell(new Paragraph("项目介绍", font2));
				PdfPCell cell42 = new PdfPCell(new Paragraph(projects.get(i).getProjectIntroduction(), font2));			
				setTableData(datatable2, cell21);
				setTableData(datatable2, cell21);
				setTableData(datatable2, cell31);
				setTableData(datatable2, cell32);
				setTableData(datatable2, cell41);
				setTableData(datatable2, cell42);
				document.add(datatable2);
			}
			
			document.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.setContentType("application/pdf");
		response.setContentLength(baos.size());
		OutputStream out = response.getOutputStream();
		baos.writeTo(out);
		out.flush();
		out.close();

		return null;
			
	}
	@RequestMapping("/xiaochushuju")
	public String qingchushuju(Model model) {
		List<Project> projects = projectService.findByAll();
		model.addAttribute("projects", projects);
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
	@RequestMapping("/shanchu")
	public String shanchu(int projectId) {
		projectService.delect(projectId);
		return "redirect:/itProject/xiaochushuju.action";
	}
	/**
	 * 为pdf文件表格设置格式
	 */
	public void setTableData(PdfPTable pdfPTable,PdfPCell cell) {
		cell.setMinimumHeight(46);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		pdfPTable.addCell(cell);
		
	}
}
