package cn.zhiyou.mybatis.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TbUser implements Serializable{
	
	private Long id;
	
	private String username;
	
	private String sex;
	
	private Date birthday;
	
	private String address;
	
	private List<Order> orderList;


	public String getUsername() {
		return username;
	}

	public String getSex() {
		return sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "TbUser [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday + ", address="
				+ address + ", orderList=" + orderList + "]";
	}

	
	

}
