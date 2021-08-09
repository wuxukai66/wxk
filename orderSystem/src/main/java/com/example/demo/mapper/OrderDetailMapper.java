package com.example.demo.mapper;

import com.example.demo.model.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author 武旭凯
 * date: 2021/8/7 12:33
 */
@Mapper
public interface OrderDetailMapper {
    public  int add(int oid, String[] dids);

  public  List<OrderDetail> getList(int oid);
}
