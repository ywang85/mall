package com.wangyije.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserRegosterForm {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;
}
