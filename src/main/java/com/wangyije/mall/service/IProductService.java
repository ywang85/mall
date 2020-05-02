package com.wangyije.mall.service;

import com.github.pagehelper.PageInfo;
import com.wangyije.mall.vo.ProductDetailVo;
import com.wangyije.mall.vo.ResponseVo;

public interface IProductService {
    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

    ResponseVo<ProductDetailVo> detail(Integer productId);
}
