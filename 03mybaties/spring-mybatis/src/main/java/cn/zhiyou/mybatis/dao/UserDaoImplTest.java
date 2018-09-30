package cn.zhiyou.mybatis.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhiyou.mybatis.mapper.UserMapper;
import cn.zhiyou.mybatis.po.TbUser;

public class UserDaoImplTest {
	
	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserByIdByMapper() {
		UserMapper userMapper=(UserMapper)context.getBean("userMapper");
		TbUser user = userMapper.findUserById(1L);
		System.out.println(user);
	}

	@Test
	public void testFindUserById() {
		UserDao userDao=(UserDao)context.getBean("userDao");
		TbUser user = userDao.findUserById(1L);
		System.out.println(user);
	}

}
