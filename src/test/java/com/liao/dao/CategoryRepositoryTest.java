package com.liao.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.liao.BlogApiApplicationTests;
import com.liao.repository.CategoryRepository;

public class CategoryRepositoryTest extends BlogApiApplicationTests{

	@Autowired
	private CategoryRepository	categoryRepository;

	@Test
	public void test() {
	}
}
