package hdgc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hdgc.bean.Websystem;
import hdgc.bean.WebsystemExample;
import hdgc.dao.WebsystemMapper;
import hdgc.service.WebsystemService;
@Service
public class WebsystemServiceImpl implements WebsystemService {
	@Autowired
	private WebsystemMapper webSystemMapper;

	@Override
	public List<Websystem> findAllSystem() {
		WebsystemExample example=new WebsystemExample();
		example.createCriteria().andIsdeletedEqualTo(false);
		return webSystemMapper.selectByExample(example);
	}

	@Override
	public Websystem findSystemById(long id) {
		
		return webSystemMapper.selectByPrimaryKey(id);
	}

}
