package com.liao.repository.wrapper;

import com.liao.entity.Article;
import com.liao.vo.ArticleVo;
import com.liao.vo.PageVo;

import java.util.List;

public interface ArticleWrapper {
    List<Article> listArticles(PageVo page);

    List<Article> listArticles(ArticleVo article, PageVo page);

    List<ArticleVo> listArchives();

}
