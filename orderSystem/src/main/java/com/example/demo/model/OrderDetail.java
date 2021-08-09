package com.example.demo.model;

import lombok.Data;

/**
 * author 武旭凯
 * date: 2021/7/31 14:59
 */
@Data
public class OrderDetail {
    private int oid;
    private int did;
    private Dish dish;
}
