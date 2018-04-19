package hdgc.service;

import java.util.List;

import hdgc.bean.Project;

public interface ProjectService {
	List<Project> findByUserId(Long userId);
	int add(Project project);
}
