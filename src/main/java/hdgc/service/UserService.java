package hdgc.service;

import java.util.List;

import hdgc.bean.User;

public interface UserService {
	/**
	 * ����user��
	 * @param user
	 * @return
	 */
	int add(User user);
	
	List<User> findByNameAndPassword(String username,String password);
}
