package com.wangyije.mall.controller;

import com.wangyije.mall.service.ICategoryService;
import com.wangyije.mall.vo.CategoryVo;
import com.wangyije.mall.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categories")
    public ResponseVo<List<CategoryVo>> selectAll() {
        ResponseVo<List<CategoryVo>> responseVo = categoryService.selectAll();
        return responseVo;
    }
}
