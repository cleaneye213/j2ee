package cn.zhiyou.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zhiyou.model.Order;
import cn.zhiyou.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class OrderServiceTest {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void testOrder(){
		Order order = orderService.selectByPrimaryKey(1);
		System.out.println(order);
	}

}
