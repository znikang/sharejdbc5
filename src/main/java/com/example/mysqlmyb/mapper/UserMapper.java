package com.example.mysqlmyb.mapper;

import com.example.mysqlmyb.dto.User;
import com.example.mysqlmyb.dto.UserOrder;

import java.util.List;

public interface UserMapper {

  User getById(Long id);


  List<User> getall();

  List<UserOrder> getallorder();

  int insert(User u);
}
