package hdgc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hdgc.bean.Power;
import hdgc.bean.PowerExample;
import hdgc.dao.PowerMapper;
import hdgc.service.PowerService;
@Service
public class PowerServiceImpl implements PowerService {
	@Autowired
	private PowerMapper powerMapper;

	@Override
	public List<Power> findBySuperId(Long id) {
		PowerExample example=new PowerExample();
		example.createCriteria().andSuperIdEqualTo(id);
		return powerMapper.selectByExample(example);
	}

}
