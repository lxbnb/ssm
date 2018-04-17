package hdgc.service;

import java.util.List;

import hdgc.bean.User;

public interface UserService {
	/**
	 * ≤Â»Îuser±Ì
	 * @param user
	 * @return
	 */
	int add(User user);
	
	List<User> findByNameAndPassword(String username,String password);
}
