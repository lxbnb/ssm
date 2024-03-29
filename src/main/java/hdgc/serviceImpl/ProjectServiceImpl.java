package hdgc.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hdgc.bean.Project;
import hdgc.bean.ProjectExample;
import hdgc.dao.ProjectMapper;
import hdgc.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	@Resource
	private ProjectMapper projectDAO;
	@Override
	public List<Project> findByUserId(Long userId) {
		// TODO Auto-generated method stub
		ProjectExample example = new ProjectExample();
		example.createCriteria().andUseridEqualTo(userId);
		return projectDAO.selectByExample(example);
	}
	@Override
	public int add(Project project) {
		// TODO Auto-generated method stub
		return projectDAO.insertSelective(project);
	}
	@Override
	public List<Project> findByAll() {
		// TODO Auto-generated method stub
		ProjectExample example = new ProjectExample();
		return projectDAO.selectByExample(example);
	}
	@Override
	public int delect(int projectId) {
		// TODO Auto-generated method stub
		return projectDAO.deleteByPrimaryKey(projectId);
	}

}
