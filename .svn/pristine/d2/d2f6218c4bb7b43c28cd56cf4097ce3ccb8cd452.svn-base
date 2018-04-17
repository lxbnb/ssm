package hdgc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hdgc.bean.Msg;
import hdgc.bean.Power;
import hdgc.service.PowerService;

@Controller
public class CommonJspController {
	@Autowired
	private PowerService powerService;
	@ResponseBody
	@RequestMapping("powerlist")
	public Msg getpowerlist(@RequestParam("super_id")Long super_id){
		List<Power> list=powerService.findBySuperId(super_id);
		return Msg.success().add("powerlist", list);
	}

}
