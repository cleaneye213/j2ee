package cn.zhiyou.mybatis.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.zhiyou.mybatis.mapper.OrderMapper;
import cn.zhiyou.mybatis.mapper.UserMapper;
import cn.zhiyou.mybatis.po.OrderQuery01;
import cn.zhiyou.mybatis.po.OrderQuery02;
import cn.zhiyou.mybatis.po.OrderQuery03;
import cn.zhiyou.mybatis.po.OrderQuery04;
import cn.zhiyou.mybatis.po.TbUser;

public class OrderMapperTest {

	private SqlSessionFactory factory;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		factory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	
	@Test
	public void test5(){
		SqlSession session = factory.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<OrderQuery04> list = mapper.queryOrderUserLazy();
		for (OrderQuery04 temp : list) {
			System.out.println(temp);
		}
		
		OrderQuery04 temp1=list.get(0);
		TbUser user=temp1.getUser();
		System.out.println(user);
	}
	
	
	
	@Test
	public void test4(){
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<TbUser> tbUser = mapper.queryUserGoodsInfo();
		for (TbUser user : tbUser) {
			System.out.println("queryUserGoodsInfo"+user.toString());
		}
	}
	
	@Test
	public void test3(){
		SqlSession session = factory.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<OrderQuery03> queryOderAndUser = mapper.queryOrderUserDetailByResMap();
		for (OrderQuery03 orderQuery03 : queryOderAndUser) {
			System.out.println("queryOrderUserDetailByResMap"+orderQuery03);
		}
	}
	
	@Test
	public void testQueryOderAndUser2(){
		SqlSession session = factory.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<OrderQuery02> queryOderAndUser = mapper.queryOderUserByReslutMap();
		for (OrderQuery02 orderQuery02 : queryOderAndUser) {
			System.out.println(orderQuery02);
		}
	}
	
	@Test
	public void testQueryOderAndUser(){
		SqlSession session = factory.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<OrderQuery01> queryOderAndUser = mapper.queryOderAndUser();
		for (OrderQuery01 orderQuery01 : queryOderAndUser) {
			System.out.println(orderQuery01);
		}
	}
	
}
