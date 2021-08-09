package com.example.demo.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * author 武旭凯
 * date: 2021/7/31 14:51
 */
@Data
public class Dish {
    private int id;
    private String name;
    private BigDecimal price;
}
