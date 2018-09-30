package cn.zhiyou.mybatis.test;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.zhiyou.mybatis.mapper.UserMapper;
import cn.zhiyou.mybatis.po.TbUser;

public class UserMapperTest2 {

	private SqlSessionFactory factory;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		factory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testTwoCache2() {
		//二级缓存测试
		SqlSession session1 = factory.openSession();
		SqlSession session2 = factory.openSession();
		SqlSession session3 = factory.openSession();
		
		UserMapper mapper1 = session1.getMapper(UserMapper.class);
		TbUser user1 = mapper1.findUserById(1L);
		System.out.println(user1);
		
		//在close()的时候才会把缓存写入到二级缓存
		session1.close();
		
		//执行更新操作，清空二级缓存里的所有数据
		UserMapper mapper3 = session3.getMapper(UserMapper.class);
		user1.setSex("女1");
		int count = mapper3.updateUser(user1);
		System.out.println("更新的记录数："+count);
		session3.commit();
		session3.close();
		
		
		System.out.println("第二次查询 从数据库查询读取");
		UserMapper mapper2 = session2.getMapper(UserMapper.class);
		TbUser user2 = mapper2.findUserById(1L);
		System.out.println(user2);
		
		session2.close();
	}
	
	
	@Test
	public void testCache() {
		//二级缓存测试
		SqlSession session1 = factory.openSession();
		SqlSession session2 = factory.openSession();
		
		UserMapper mapper1 = session1.getMapper(UserMapper.class);
		TbUser user1 = mapper1.findUserById(1L);
		System.out.println(user1);
		
		//在close()的时候才会把缓存写入到二级缓存
		session1.close();
		
		System.out.println("第二次查询 从缓存读取");
		UserMapper mapper2 = session2.getMapper(UserMapper.class);
		TbUser user2 = mapper2.findUserById(1L);
		System.out.println(user2);
		
		session2.close();
	}
	

	@Test
	public void testFindUserById() {
		//一级缓存测试
		SqlSession session1 = factory.openSession();
		
		UserMapper mapper1 = session1.getMapper(UserMapper.class);
		TbUser user1 = mapper1.findUserById(1L);
		System.out.println(user1);
		
		//清空一级缓存,后面语句会去数据库获取数据
		session1.commit();
		
		//如果没有session1.commit();第二次查询 从缓存读取
		System.out.println("第二次查询 从缓存读取");

		TbUser user2 = mapper1.findUserById(1L);
		System.out.println(user2);
		
		session1.close();
	}

}
