package hdgc.controller;

import java.util.List;

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
import hdgc.bean.Msg;
import hdgc.bean.UserInfo;
import hdgc.bean.Websystem;
import hdgc.service.UserInfoService;
import hdgc.service.WebsystemService;

@Controller
public class SystemListController {
	@Autowired
	private WebsystemService webSystemService;
	@Autowired
	private UserInfoService userInfoService;
	
	@ResponseBody
	@RequestMapping("systemlist")
	public Msg systemlist(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
		PageHelper.startPage(pn, 5);
		List<Websystem> slist=webSystemService.findAllSystem();
		PageInfo<Websystem> page=new PageInfo<>(slist, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping("websystemlist")
	public String websystemlist(){
		return "systemlist";
		
	}
	
	
	@ResponseBody
	@RequestMapping("check_personInfo")
	public Msg personAccount(HttpSession session,long systemId){
		Alluser user=(Alluser) session.getAttribute("user");
		Websystem system=webSystemService.findSystemById(systemId);
		long num=userInfoService.countByUserId(user.getId());
		if(num>1){
			return Msg.fail().add("title", "禁止访问").add("msg", "存在多条记录请联系管理员解决").add("systemInfo", system);
		}else{
			if(num==1){
				boolean iscomplete=userInfoService.validByUserId(user.getId());
				if(iscomplete){
					return Msg.success().add("title", "可以注册").add("msg", "信息完善").add("systemInfo", system);
				}else{
					return Msg.fail().add("title", "禁止访问").add("msg", "信息不完整,请先完善您的个人信息").add("systemInfo", system);
				}
			}else{
				return Msg.fail().add("title", "禁止访问").add("msg", "信息不完整，请先到基本信息管理-个人信息中填写您的基本信息").add("systemInfo", system);
			}
		}
	}

}
