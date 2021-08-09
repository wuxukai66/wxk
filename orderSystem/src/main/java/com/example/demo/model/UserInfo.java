package com.example.demo.model;

import lombok.Data;

/**
 * author 武旭凯
 * date: 2021/7/31 14:46
 */
@Data
public class UserInfo {
    private int id;
    private String username;
    private String password;
    private int isadmin;
}
