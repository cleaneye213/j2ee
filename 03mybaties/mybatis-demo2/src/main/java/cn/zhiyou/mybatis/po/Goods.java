package cn.zhiyou.mybatis.po;

import java.util.Date;

public class Goods {

	private int id;
	
	private String name;
	
	private Double price;
	
	private Date create_time;
	
	private String detail;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public String getDetail() {
		return detail;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", create_time=" + create_time + ", detail="
				+ detail + "]";
	}
	
	
}
