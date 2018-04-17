package hdgc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hdgc.bean.UserInfo;
import hdgc.bean.UserInfoExample;
import hdgc.dao.UserInfoMapper;
import hdgc.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public List<UserInfo> findByUserId(Long id) {
		UserInfoExample example=new UserInfoExample();
		example.createCriteria().andAlluserIdEqualTo(id);
		return userInfoMapper.selectByExample(example);
	}

	@Override
	public boolean validByUserId(Long id) {
		UserInfoExample example=new UserInfoExample();
		example.createCriteria().andAlluserIdEqualTo(id);
		List<UserInfo> uilist=userInfoMapper.selectByExample(example);
		UserInfo userinfo=uilist.get(0);
		if(null!=userinfo.getName()&&null!=userinfo.getIdcard()
				&&null!=userinfo.getNation()
				&&null!=userinfo.getIdcardImg()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public long countByUserId(Long id) {
		UserInfoExample example=new UserInfoExample();
		example.createCriteria().andAlluserIdEqualTo(id);
		return userInfoMapper.countByExample(example);
	}

}
