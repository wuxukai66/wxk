package com.example.demo.controller;

import com.example.demo.mapper.DishMapper;
import com.example.demo.model.Dish;
import com.example.demo.tools.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * author 武旭凯
 * date: 2021/7/31 20:02
 */
@RestController
@RequestMapping("/dish")
public class DishController {
    @Resource
    private DishMapper dishMapper;

    @RequestMapping("/list")
    public ResponseBody<List<Dish>> getList(){
        List<Dish> data=dishMapper.getList();
        return new ResponseBody<>(0,"",data);
    }
    @RequestMapping("/add")
    public ResponseBody<Integer> add(Dish dish){
        int data=0;
        data=dishMapper.add(dish);
        return new ResponseBody<>(0,"",data);
    }

    @RequestMapping("/del")
    public ResponseBody<Integer> del(int id){
        int data=dishMapper.del(id);
        return new ResponseBody<>(0,"",data);
    }
}
