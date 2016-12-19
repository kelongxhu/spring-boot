package com.boot.web;

import com.boot.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
public class JdbcTests {

	@Autowired
	private UserService userServiceJdbc;

	@Before
	public void setUp() {
		// 准备，清空user表
	}

	@Test
	public void test() throws Exception {
		// 插入5个用户
		userServiceJdbc.create("a", 1);
		userServiceJdbc.create("b", 2);
		userServiceJdbc.create("c", 3);
		userServiceJdbc.create("d", 4);
		userServiceJdbc.create("e", 5);

		// 查数据库，应该有5个用户
//		Assert.assertEquals(5, userServiceJdbc.getAllUsers().intValue());

		// 删除两个用户
		// 查数据库，应该有5个用户
//		Assert.assertEquals(3, userServiceJdbc.getAllUsers().intValue());


		System.out.println(userServiceJdbc.getAllUsers().intValue());

	}


}
