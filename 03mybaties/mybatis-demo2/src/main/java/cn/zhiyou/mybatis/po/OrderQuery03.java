package cn.zhiyou.mybatis.po;

import java.util.List;

public class OrderQuery03 extends Order{

	//用户信息
	private TbUser user;
	
	//订单明细
	private List<OrderDetail> orderDetailList;

	@Override
	public String toString() {
		return "OrderQuery03 [user=" + user + ", orderDetailList=" + orderDetailList + "]";
	}

	public TbUser getUser() {
		return user;
	}

	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setUser(TbUser user) {
		this.user = user;
	}

	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	
}
