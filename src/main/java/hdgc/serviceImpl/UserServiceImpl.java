package hdgc.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hdgc.bean.User;
import hdgc.bean.UserExample;
import hdgc.dao.UserMapper;
import hdgc.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource 
	private UserMapper userDao;
	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return userDao.insertSelective(user);
	}
	@Override
	public List<User> findByNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username).andUserpasswordEqualTo(password);
		return userDao.selectByExample(example);
	}

}
