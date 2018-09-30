package cn.zhiyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhiyou.mapper.OrderMapper;
import cn.zhiyou.model.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	
	public Order selectByPrimaryKey(Integer id){
		return this.orderMapper.selectByPrimaryKey(id);
	}

}
