package hdgc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import hdgc.bean.Alluser;
import hdgc.bean.CompanyInfo;
import hdgc.bean.Msg;
import hdgc.bean.UserInfo;
import hdgc.service.CompanyInfoService;
import hdgc.service.UserInfoService;

@Controller
public class BasicInfoController {
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private CompanyInfoService companyInfoService;
	@RequestMapping("person_info")
	public String person_info(HttpSession session,Model model){
		Alluser user=(Alluser) session.getAttribute("user");
		List<UserInfo> uiList=userInfoService.findByUserId(user.getId());
		if(uiList.size()>0){
			UserInfo userInfo=uiList.get(0);
			model.addAttribute("userInfo", userInfo);
		}else{
			
		}
		return "personInfo";
	}
	@RequestMapping("company_list")
	public String companylist(HttpSession session){
		Alluser user=(Alluser)session.getAttribute("user");
		long num=companyInfoService.countByUserId(user.getId());
		if(num>0){
			return "companylist";
		}else{
			return "companyInfo";
		}
		
	}
	@ResponseBody
	@RequestMapping("company_info")
	public Msg company_info(HttpSession session,@RequestParam(value="pn",defaultValue="1")Integer pn){
		Alluser user=(Alluser)session.getAttribute("user");
		List<CompanyInfo> comlist=companyInfoService.findAllCompany(user.getId(), null);
		PageHelper.startPage(pn, 5);
		PageInfo<CompanyInfo> page=new PageInfo<>(comlist, 5);
		return Msg.success().add("pageInfo", page);
	}

}
