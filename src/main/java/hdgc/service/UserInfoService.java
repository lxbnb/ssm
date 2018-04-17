package hdgc.service;

import java.util.List;

import hdgc.bean.UserInfo;

public interface UserInfoService {
	/**
	 * 搜索用户信息
	 * @param id
	 * @return
	 */
	public List<UserInfo> findByUserId(Long id);
	/**
	 * 验证用户基本信息是否完善
	 * @param id
	 * @return
	 */
	public boolean validByUserId(Long id);
	/**
	 * 获取用户信息记录的条数
	 * @param id
	 * @return
	 */
	public long countByUserId(Long id);

}
