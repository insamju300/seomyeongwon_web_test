package com.smw.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.smw.demo.vo.Article;

@Mapper
public interface ArticleRepository {
    
	@Insert("""
			INSERT INTO Article(regDate, updateDate, title, body) VALUES(NOW(), NOW(), #{title}, #{body})
			""")
	
	void doWrite(String title, String body);
	
	@Select("SElECT LAST_INSERT_ID()")
	Integer findLastInsertId();

	@Select("SELECT * FROM ARTICLE WHERE ID = #{id}")
	Article showDetailById(int id);

	@Update("Update ARTICLE SET title=#{title}, body=#{body} where id=#{id}")
	void doModify(int id, String title, String body);

	@Select("SELECT * FROM article")
	List<Article> showLists();

	@Delete("DELETE FROM article where id=#{id}")
	void doDelete(int id);

}
