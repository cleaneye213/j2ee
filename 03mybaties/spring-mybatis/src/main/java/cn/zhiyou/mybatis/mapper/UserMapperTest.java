package cn.zhiyou.mybatis.mapper;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.zhiyou.mybatis.po.TbUser;
import cn.zhiyou.mybatis.po.UserQuery;

public class UserMapperTest {
	
	private SqlSessionFactory factory;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		factory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	
	@Test
	public void test8(){
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		UserQuery user=new UserQuery();
		List<Long> ids=new ArrayList<Long>();
		ids.add(1L);
		ids.add(32L);
		ids.add(34L);
		user.setIds(ids);
		List<TbUser> queryUserBy = mapper.queryUserByIds(user);
		for (TbUser tbUser2 : queryUserBy) {
			System.out.println("queryUserByIds:"+tbUser2);
		}
		session.close();
	}
	
	@Test
	public void test7(){
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		UserQuery user=new UserQuery();
		TbUser tbuser=new TbUser();
		tbuser.setUsername("小");
		tbuser.setSex("男");
		user.setTbUser(tbuser);
		List<TbUser> queryUserBy = mapper.queryUserList(user);
		for (TbUser tbUser2 : queryUserBy) {
			System.out.println("queryUserList:"+tbUser2);
		}
		session.close();
	}
	
	@Test
	public void test6(){
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		List<TbUser> queryUserBy = mapper.selectAllUser();
		for (TbUser tbUser2 : queryUserBy) {
			System.out.println("selectAllUser:"+tbUser2);
		}
		session.close();
	}
	
	@Test
	public void test5(){
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		List<String> queryUserBy = mapper.queryUserName("小");
		for (String temp : queryUserBy) {
			System.out.println("queryUserName:"+temp);
		}
		session.close();
	}
	
	@Test
	public void test4(){
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		Map<String,Object> map=new HashMap<>();
		map.put("username1", "小");
		map.put("sex1","男");
		List<TbUser> queryUserBy = mapper.queryUserByMap(map);
		for (TbUser tbUser2 : queryUserBy) {
			System.out.println("queryUserByMap:"+tbUser2);
		}
		session.close();
	}
	
	@Test
	public void test3(){
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		UserQuery user=new UserQuery();
		TbUser tbuser=new TbUser();
		tbuser.setUsername("小");
		tbuser.setSex("男");
		user.setTbUser(tbuser);
		List<TbUser> queryUserBy = mapper.queryUserBy(user);
		for (TbUser tbUser2 : queryUserBy) {
			System.out.println(tbUser2);
		}
		session.close();
	}
	
	@Test
	public void test2() {
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		TbUser user = new TbUser();
		user.setId(32L);
		user.setUsername("小六6");
		user.setSex("女");
		user.setBirthday(new Date());
		user.setAddress("福州闽侯2");
		int updateUser = mapper.updateUser(user);
		
		session.commit();
		session.close();
		System.out.println(updateUser);
	}

	@Test
	public void testFindUserByName() {
		SqlSession session = factory.openSession();
		//生成代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<TbUser> list = mapper.findUserByName("小");
		
		for (TbUser tbUser : list) {
			System.out.println(tbUser);
		}
		session.close();
	}

}
