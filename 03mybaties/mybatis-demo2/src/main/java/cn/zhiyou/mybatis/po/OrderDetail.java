package cn.zhiyou.mybatis.po;

public class OrderDetail {

	private int id;
	
	private int order_id;
	
	private int goods_id;
	
	private int goods_num;
	
	private Goods goods;

	public int getId() {
		return id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public int getGoods_num() {
		return goods_num;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", order_id=" + order_id + ", goods_id=" + goods_id + ", goods_num="
				+ goods_num + "]";
	}
	
	
}
