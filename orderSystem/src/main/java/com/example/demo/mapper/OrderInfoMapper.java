package com.example.demo.mapper;

import com.example.demo.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author 武旭凯
 * date: 2021/8/7 10:02
 */
@Mapper
public interface OrderInfoMapper {
   public int add(OrderInfo orderInfo);

  public   List<OrderInfo> getList(int uid);

  public   List<OrderInfo> getAllList();

   public  int up(int oid, int status);
}
