package com.liao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liao.entity.Article;
import com.liao.entity.Comment;

/**
 * @author liao
 * <p>
 * 2018年1月25日
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByArticleAndLevelOrderByCreateDateDesc(Article a, String level);


}
