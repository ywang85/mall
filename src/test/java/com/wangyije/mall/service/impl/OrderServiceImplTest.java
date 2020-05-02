package com.wangyije.mall.service.impl;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wangyije.mall.MallApplicationTests;
import com.wangyije.mall.service.IOrderService;
import com.wangyije.mall.vo.OrderVo;
import com.wangyije.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
@Slf4j
public class OrderServiceImplTest extends MallApplicationTests {
    @Autowired
    private IOrderService iOrderService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void create() {
        ResponseVo<OrderVo> responseVo = iOrderService.create(5, 8);
        log.info("result={}", gson.toJson(responseVo));
    }

    @Test
    public void list() {
        ResponseVo<PageInfo> responseVo = iOrderService.list(5, 1, 2);
        log.info("result={}", gson.toJson(responseVo));
    }

    @Test
    public void detail() {
        ResponseVo<OrderVo> detail = iOrderService.detail(5, 1588304701921L);
        log.info("result={}", gson.toJson(detail));
    }

    @Test
    public void cancel() {
        ResponseVo cancel = iOrderService.cancel(5, 1588304701921L);
        log.info("result={}", gson.toJson(cancel));
    }
}