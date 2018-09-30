package cn.zhiyou.mybatis.test;

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
	
	
	

}
