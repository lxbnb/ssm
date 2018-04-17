package hdgc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hdgc.bean.CompanyInfo;
import hdgc.bean.CompanyInfoExample;
import hdgc.dao.CompanyInfoMapper;
import hdgc.service.CompanyInfoService;
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {
	@Autowired
	private CompanyInfoMapper companyInfoMapper;

	@Override
	public List<CompanyInfo> findAllCompany(long userId,String orderby) {
		CompanyInfoExample example=new CompanyInfoExample();
		example.createCriteria().andAlluserIdEqualTo(userId);
		if(orderby!=null){
			example.setOrderByClause(orderby);
		}
		return companyInfoMapper.selectByExample(example);
	}

	@Override
	public CompanyInfo findById(long comId) {
		
		return companyInfoMapper.selectByPrimaryKey(comId);
	}

	@Override
	public long countByUserId(long userId) {
		CompanyInfoExample example=new CompanyInfoExample();
		example.createCriteria().andAlluserIdEqualTo(userId);
		return companyInfoMapper.countByExample(example);
	}

	

}
