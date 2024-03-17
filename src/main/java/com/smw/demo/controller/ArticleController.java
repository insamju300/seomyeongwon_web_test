package com.smw.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smw.demo.service.ArticleService;
import com.smw.demo.util.Ut;
import com.smw.demo.vo.Article;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/article/showWrite")
	public String showWrite() {
		
		return "/article/write";
	}
	
	@RequestMapping("/article/showList")
	public String showList(Model model) {
		List<Article> articles = articleService.showList();
		model.addAttribute("articles" ,articles);
		return "/article/list";
	}
	
	@RequestMapping("/article/doWrite")
	@ResponseBody
	public String doWrite(String title, String body){
		if(Ut.isEmpty(title)) {
			return Ut.jsHistoryBack("F-1", "제목을 입력해 주세요.");
		}
		
		if(Ut.isEmpty(title)) {
			return Ut.jsHistoryBack("F-2", "내용을 입력해 주세요.");
		}
		
		articleService.doWrite(title, body);
		
		Integer id = articleService.findLastInsertId();
		
		
		return Ut.jsReplace("S-1", "success", "/article/showDetail?id="+id);
	}
	
	@RequestMapping("/article/showDetail")
	public String showDetail(int id, Model model) {
		Article article = articleService.showDetailById(id);
		model.addAttribute("article" ,article);
		return "/article/detail";
	}
	
	@RequestMapping("/article/showModify")
	public String showModify(int id, Model model) {
		Article article = articleService.showDetailById(id);
		model.addAttribute("article" ,article);
		return "/article/modify";
	}	

	
	@RequestMapping("/article/doModify")
	public String showModify(int id, String title, String body) {
		articleService.doModify(id, title, body);
		
		return "redirect:/article/showDetail?id="+id;
	}	
	
	@RequestMapping("/article/doDelete")
	public String showModify(int id) {
		articleService.doDelete(id);
		
		return "redirect:/article/showList";
	}	

}
