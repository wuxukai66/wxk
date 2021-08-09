package com.example.demo.mapper;

import com.example.demo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author 武旭凯
 * date: 2021/7/31 14:57
 */
@Mapper
public interface UserMapper {
    public int register(UserInfo userInfo);

    public List<UserInfo> getUserList();

   public  UserInfo login(UserInfo userInfo);
}
