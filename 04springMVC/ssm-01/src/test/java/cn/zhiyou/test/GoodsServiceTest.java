package cn.zhiyou.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zhiyou.model.Goods;
import cn.zhiyou.model.Order;
import cn.zhiyou.service.GoodsService;
import cn.zhiyou.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class GoodsServiceTest {
	
	@Autowired
	private GoodsService goodsService;
	
	@Test
	public void testOrder(){
		Goods goods = goodsService.getGoods(1);
		System.out.println(goods);
	}

}
