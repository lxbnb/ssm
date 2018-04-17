package hdgc.service;

import java.util.List;

import hdgc.bean.Alluser;

public interface AlluserService {
	/**
	 * 验证用户名的唯一性
	 * @param name
	 * @return true有，false没有
	 */
	public boolean validateUsername(String name);
	/**
	 * 保存用户
	 * @param name
	 * @return  Id
	 */
	public Long saveUser(Alluser user);
	/**
	 * 保存用户
	 * @param name
	 * @return int相同用户数量
	 */
	public long validAllUser(Alluser user);
	/**
	 * 保存用户
	 * @param name
	 * @return int相同用户数量
	 */
	public List<Alluser> findByNameAndPassword(String name,String password);

}
