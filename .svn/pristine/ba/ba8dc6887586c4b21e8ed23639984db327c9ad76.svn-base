package hdgc.test;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hdgc.bean.Alluser;
import hdgc.dao.AlluserMapper;
import hdgc.service.AlluserService;


@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private AlluserService alluserService;

	@Test
	public void DaoTest() {
		AlluserMapper mapper=sqlSession.getMapper(AlluserMapper.class);
		Alluser user=new Alluser();
		user.setUsername("测试用户");
		user.setPassword("123456");
		mapper.insertSelective(user);
		System.out.println(user.getId());
		System.out.println(user.getIsdeleted());
	}
	@Test
	public void ServiceTest() {
		alluserService.validateUsername("测试用户");
	}

}
