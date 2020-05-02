package com.wangyije.mall.service;

import com.wangyije.mall.vo.CategoryVo;
import com.wangyije.mall.vo.ResponseVo;

import java.util.List;
import java.util.Set;

public interface ICategoryService {
    ResponseVo<List<CategoryVo>> selectAll();

    void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
