package cn.zhiyou.mybatis.mapper;

import java.util.List;

import cn.zhiyou.mybatis.po.OrderQuery01;
import cn.zhiyou.mybatis.po.OrderQuery02;
import cn.zhiyou.mybatis.po.OrderQuery03;
import cn.zhiyou.mybatis.po.OrderQuery04;

public interface OrderMapper {

	public List<OrderQuery01> queryOderAndUser();
	
	public List<OrderQuery02> queryOderUserByReslutMap();
	
	public List<OrderQuery03> queryOrderUserDetailByResMap();
	
	public List<OrderQuery04> queryOrderUserLazy();
}
