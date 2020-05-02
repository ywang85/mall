package com.wangyije.mall.dao;

import com.wangyije.mall.MallApplicationTests;
import com.wangyije.mall.pojo.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductMapperTest extends MallApplicationTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void selectByProductIdList() {
        List<Integer> productIdList = new ArrayList<>();
        productIdList.add(26);
        productIdList.add(27);
        productIdList.add(28);
        List<Product> productList = productMapper.selectByProductIdList(productIdList);
        Assert.assertEquals(3, productIdList.size());
    }
}