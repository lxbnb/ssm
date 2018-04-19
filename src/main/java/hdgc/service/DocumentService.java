package hdgc.service;

import java.util.List;

import hdgc.bean.Document;

public interface DocumentService {
	List<Document> findByUserId(Long userId);
}
