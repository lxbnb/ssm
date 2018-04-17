package hdgc.service;

import java.util.List;

import hdgc.bean.Power;

public interface PowerService {
	/**
	 * 筛选某一权限下的子权限
	 * @param id
	 * @return
	 */
	public List<Power> findBySuperId(Long id);

}
