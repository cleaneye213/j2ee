package cn.zhiyou.mybatis.po;

import java.util.Date;
import java.util.List;

public class Order {
	
	private Integer id;
    private Integer userId;
    private String orderNumber;
    private Date createTime;
    private String detail;
    
    private List<OrderDetail> orderDetailList;
    
	public Integer getId() {
		return id;
	}
	public Integer getUserId() {
		return userId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public String getDetail() {
		return detail;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
    
    

}
