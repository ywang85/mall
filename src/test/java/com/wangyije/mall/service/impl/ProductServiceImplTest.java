package com.wangyije.mall.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyije.mall.MallApplicationTests;
import com.wangyije.mall.enums.ResponseEnum;
import com.wangyije.mall.service.IProductService;
import com.wangyije.mall.vo.ProductDetailVo;
import com.wangyije.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImplTest extends MallApplicationTests {

    @Autowired
    private IProductService productService;
    @Test
    public void list() {
        ResponseVo<PageInfo> responseVo = productService.list(null, 1, 1);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }

    @Test
    public void detail() {
        ResponseVo<ProductDetailVo> responseVo = productService.detail(26);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }
}