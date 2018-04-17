package ssm;

import java.util.List;

import javax.annotation.Resource;  


import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hdgc.bean.UserInfo;
import hdgc.service.UserInfoService;  
 

 
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
 
public class TestMyBatis {  
   
// private ApplicationContext ac = null;  
   @Resource  
   private UserInfoService userService = null;  
 
// @Before  
// public void before() {  
//     ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//     userService = (IUserService) ac.getBean("userService");  
// }  
 
   @Test  
   public void test1() {  
       List<UserInfo> user = userService.findByUserId(1L);  
       // System.out.println(user.getUserName());  
       // logger.info("值："+user.getUserName());  
       System.out.println(user.get(0).getBirthday());
       /*logger.info(JSON.toJSONString(user.get(0)));  */
   }  
}  

