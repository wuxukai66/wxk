package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * author 武旭凯
 * date: 2021/7/4 10:12
 */
@RestController
@RequestMapping("/met")
public class MethodController {
    @GetMapping("/people/{pid}/animal/{aid}")
        public String method1(@PathVariable String pid,@PathVariable("aid") String animalID){
            return "用户ID:"+pid+",动物ID:"+animalID;
        }
        @RequestMapping("/getname")
        public String method2(String name){
        return "姓名:"+name;
        }
    @RequestMapping("/login2")
    public String method3(@RequestBody String name, String password){
        return "姓名:"+name+"密码:"+password;
    }

    @RequestMapping("/reg")
    public String method4(@RequestParam(required = false) String name){//false代表是非必传项
        return "姓名:"+name;
    }

}
