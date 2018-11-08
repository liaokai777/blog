package com.liao.service;

import java.util.List;

import com.liao.entity.Category;
import com.liao.vo.CategoryVO;

/**
 * @author liao
 * <p>
 * 2018年1月25日
 */
public interface CategoryService {

    List<Category> findAll();

    Category getCategoryById(Integer id);

    Integer saveCategory(Category category);

    Integer updateCategory(Category category);

    void deleteCategoryById(Integer id);

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);

}
