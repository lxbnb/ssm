package hdgc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hdgc.bean.Alluser;
import hdgc.bean.AlluserExample;
import hdgc.dao.AlluserMapper;
import hdgc.service.AlluserService;
@Service
public class AlluserServiceImpl implements AlluserService {
	@Autowired
	private AlluserMapper alluserMapper;

	@Override
	public boolean validateUsername(String name) {
		AlluserExample example=new AlluserExample();
		example.createCriteria().andUsernameEqualTo(name.trim())
		.andIsdeletedEqualTo(false);
		List<Alluser> ulist=alluserMapper.selectByExample(example);
		if(ulist.size()==0){
			return false;
		}else{
		    return true;	
		}
	}

	@Override
	public Long saveUser(Alluser user) {
		alluserMapper.insertSelective(user);
		return user.getId();
	}

	@Override
	public long validAllUser(Alluser user) {
		AlluserExample example=new AlluserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername())
		.andPasswordEqualTo(user.getPassword())
		.andIsdeletedEqualTo(false);
		long num=alluserMapper.countByExample(example);
		return num;
		
	}

	@Override
	public List<Alluser> findByNameAndPassword(String name,String password) {
		AlluserExample example=new AlluserExample();
		example.createCriteria().andUsernameEqualTo(name)
		.andPasswordEqualTo(password)
		.andIsdeletedEqualTo(false);
		return alluserMapper.selectByExample(example);
	}

}
