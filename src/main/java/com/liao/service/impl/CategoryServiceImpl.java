package com.liao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liao.entity.Category;
import com.liao.repository.CategoryRepository;
import com.liao.service.CategoryService;
import com.liao.vo.CategoryVO;

/**
 * @author liao
 * <p>
 * 2018年1月25日
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository.getOne(id);
    }

    @Override
    @Transactional
    public Integer saveCategory(Category category) {

        return categoryRepository.save(category).getId();
    }

    @Override
    @Transactional
    public Integer updateCategory(Category category) {
        Category oldCategory = categoryRepository.getOne(category.getId());

        oldCategory.setCategoryname(category.getCategoryname());
        oldCategory.setAvatar(category.getAvatar());
        oldCategory.setDescription(category.getDescription());

        return oldCategory.getId();
    }

    @Override
    @Transactional
    public void deleteCategoryById(Integer id) {
        categoryRepository.delete(id);
    }

    @Override
    public List<CategoryVO> findAllDetail() {
        return categoryRepository.findAllDetail();
    }

    @Override
    public CategoryVO getCategoryDetail(Integer categoryId) {
        return categoryRepository.getCategoryDetail(categoryId);
    }

}
