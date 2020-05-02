package com.wangyije.mall.service.impl;

import com.wangyije.mall.MallApplicationTests;
import com.wangyije.mall.enums.RoleEnum;
import com.wangyije.mall.pojo.User;
import com.wangyije.mall.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImplTest extends MallApplicationTests {
    @Autowired
    private IUserService userService;

    @Test
    public void register() {
        User user = new User("Jason", "123456","sss@qq.com", RoleEnum.CUSTOMER.getCode());
        userService.register(user);
    }
}