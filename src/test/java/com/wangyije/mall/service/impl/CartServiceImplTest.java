package com.wangyije.mall.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wangyije.mall.MallApplicationTests;
import com.wangyije.mall.form.CartAddForm;
import com.wangyije.mall.form.CartUpdateForm;
import com.wangyije.mall.service.ICartService;
import com.wangyije.mall.vo.CartVo;
import com.wangyije.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
@Slf4j
public class CartServiceImplTest extends MallApplicationTests {

    @Autowired
    private ICartService cartService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void add() {
        CartAddForm form = new CartAddForm();
        form.setProductId(26);
        form.setSelected(true);
        cartService.add(5, form);
    }

    @Test
    public void list() {
        ResponseVo<CartVo> list = cartService.list(1);
        log.info("list={}", gson.toJson(list));
    }

    @Test
    public void update() {
        CartUpdateForm cartUpdateForm = new CartUpdateForm();
        cartUpdateForm.setQuantity(5);
        cartUpdateForm.setSelected(false);
        ResponseVo<CartVo> update = cartService.update(5, 26, cartUpdateForm);
        log.info("list={}", gson.toJson(update));
    }

    @Test
    public void delete(){
        ResponseVo<CartVo> delete = cartService.delete(1, 26);
        log.info("list={}", gson.toJson(delete));
    }

    @Test
    public void unselectAll() {
        ResponseVo<CartVo> cartVoResponseVo = cartService.unSelectAll(1);
        log.info("list={}", gson.toJson(cartVoResponseVo));
    }

    @Test
    public void sum() {
        ResponseVo<Integer> sum = cartService.sum(1);
        log.info("sum = {}", sum);
    }
}