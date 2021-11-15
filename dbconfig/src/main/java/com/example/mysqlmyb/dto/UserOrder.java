package com.example.mysqlmyb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserOrder {

  private Long id;
  private String name;
  private int age;
  private String data;

}
