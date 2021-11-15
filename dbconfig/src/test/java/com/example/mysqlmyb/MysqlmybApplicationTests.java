package com.example.mysqlmyb;

import com.example.mysqlmyb.dto.User;
import com.example.mysqlmyb.dto.UserOrder;
import com.example.mysqlmyb.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MysqlmybApplicationTests {

	@Resource
	UserMapper mapper;

	@Test
	void contextLoads() {
		PageHelper.startPage(1, 10);
		List<User>  mty  = mapper.getall();
		System.out.println("ddd");
		System.out.println(mty);

		List<UserOrder>  orders  = mapper.getallorder();
		System.out.println(orders);

//		mapper.insert(User.builder().id(10l).name("d").age(3123123).build());
//		mapper.insert(User.builder().id(11l).name("ffasdfaff").age(3123123).build());
//		mapper.insert(User.builder().id(12l).name("fasdfasfda").age(3123123).build());
//		mapper.insert(User.builder().id(6l).name("ddasda").age(333).build());
	}

}
