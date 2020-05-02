package com.wangyije.mall.service;

import com.github.pagehelper.PageInfo;
import com.wangyije.mall.MallApplicationTests;
import com.wangyije.mall.form.ShippingForm;
import com.wangyije.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.Assert.*;
@Slf4j
public class IShippingServiceTest extends MallApplicationTests {
    @Autowired
    private IShippingService shippingService;

    @Test
    public void add() {
        ShippingForm shippingForm = new ShippingForm();
        shippingForm.setReceiverName("小逸");
        shippingForm.setReceiverAddress("家里");
        shippingForm.setReceiverCity("上海市");
        shippingForm.setReceiverMobile("123456789");
        shippingForm.setReceiverPhone("555555555");
        shippingForm.setReceiverProvince("上海");
        shippingForm.setReceiverDistrict("浦东新区");
        shippingForm.setReceiverZip("222222");
        ResponseVo<Map<String, Integer>> add = shippingService.add(1, shippingForm);
        log.info("add = {}", add);
    }

    @Test
    public void delete() {
        ResponseVo delete = shippingService.delete(1, 6);
        log.info("delete= {}", delete);
    }

    @Test
    public void update() {
        ShippingForm shippingForm = new ShippingForm();
        shippingForm.setReceiverName("小逸");
        shippingForm.setReceiverAddress("家里");
        shippingForm.setReceiverCity("上海市");
        shippingForm.setReceiverMobile("123456789");
        shippingForm.setReceiverProvince("上海");
        shippingForm.setReceiverDistrict("浦东新区");
        shippingForm.setReceiverZip("200127");
        shippingForm.setReceiverPhone("123456");
        ResponseVo update = shippingService.update(1, 8, shippingForm);
        log.info("update={}", update);
    }

    @Test
    public void list() {
        ResponseVo<PageInfo> list = shippingService.list(1, 1, 10);
        log.info("list = {}", list);
    }
}