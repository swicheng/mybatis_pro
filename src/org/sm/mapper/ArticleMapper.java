package org.sm.mapper;

import java.util.List;

import org.sm.entity.Article;

public interface ArticleMapper {

  List<Article> selectArticleByOrderId(Integer id);
	
}
