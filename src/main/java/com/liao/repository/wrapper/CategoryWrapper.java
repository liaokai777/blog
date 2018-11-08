package com.liao.repository.wrapper;

import java.util.List;

import com.liao.vo.CategoryVO;

/**
 * @author liao
 * <p>
 * 2018年1月25日
 */
public interface CategoryWrapper {

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);
}
