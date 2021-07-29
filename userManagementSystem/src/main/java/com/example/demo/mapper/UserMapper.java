package com.example.demo.mapper;

import com.example.demo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author 武旭凯
 * date: 2021/7/22 17:51
 */
@Mapper
public interface UserMapper {


    public UserInfo getUser(int uid);


    public UserInfo login(String username, String password);


    public int add(UserInfo userInfo);

    public int update(UserInfo userInfo);

    public List<UserInfo> getListBypage(String name, String address, String email, int skipCount, int psize, Integer isadmin);

    //查询满足条件的条数
    public int getCount(String name, String address, String email, Integer isadmin);

    public int del(int id, Integer isadmin);

    public int dels(String[] ids);
}
