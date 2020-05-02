package com.wangyije.mall.service;

import com.wangyije.mall.pojo.User;
import com.wangyije.mall.vo.ResponseVo;

public interface IUserService {
    ResponseVo<User> register(User user);

    ResponseVo<User> login(String username, String password);

}
