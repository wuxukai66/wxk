package com.example.demo.mapper;

import com.example.demo.model.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author 武旭凯
 * date: 2021/7/31 20:09
 */
@Mapper
public interface DishMapper {
     public   List<Dish> getList();
     public int add(Dish dish);

   public  int del(int id);
}
