package hdgc.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hdgc.bean.Document;
import hdgc.bean.DocumentExample;
import hdgc.dao.DocumentMapper;
import hdgc.service.DocumentService;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService{
	@Resource
	private DocumentMapper documentDAO;
	@Override
	public List<Document> findByUserId(Long userId) {
		// TODO Auto-generated method stub
		DocumentExample example = new DocumentExample();
		example.createCriteria().andUseridEqualTo(userId);
		return documentDAO.selectByExample(example);
	}

}
