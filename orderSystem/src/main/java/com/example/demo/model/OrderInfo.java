package com.example.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * author 武旭凯
 * date: 2021/7/31 14:48
 */
@Data
public class OrderInfo {
    private int id;
    private int uid;
    private Date createtime;
    private int status;
    private String uname;
}
