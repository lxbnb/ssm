package hdgc.service;

import java.util.List;


import hdgc.bean.CompanyInfo;

public interface CompanyInfoService {
	/**
	 * 搜索用户所有的公司信息
	 * @param user
	 * @return
	 */
	public List<CompanyInfo> findAllCompany(long userId,String orderby);
	/**
	 * 查找公司基本信息
	 * @param id
	 * @return
	 */
	public CompanyInfo findById(long comId);
	/**
	 * 根据用户id查找公司数量
	 * @param id
	 * @return
	 */
	public long countByUserId(long userId);
}
