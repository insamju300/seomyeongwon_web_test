package com.smw.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smw.demo.repository.ArticleRepository;
import com.smw.demo.vo.Article;

@Service
public class ArticleService {
	
	@Autowired
	ArticleRepository articleRepository;

	public void doWrite(String title, String body) {
		articleRepository.doWrite(title, body);
	}
	
	public Integer findLastInsertId() {
		return articleRepository.findLastInsertId(); 
	}

	public Article showDetailById(int id) {
		// TODO Auto-generated method stub
		return articleRepository.showDetailById(id);
	}

	public void doModify(int id, String title, String body) {
		// TODO Auto-generated method stub
		articleRepository.doModify(id, title, body);
	}

	public List<Article> showList() {
		// TODO Auto-generated method stub
		return articleRepository.showLists();
	}

	public void doDelete(int id) {
		articleRepository.doDelete(id);
		
	}

}
