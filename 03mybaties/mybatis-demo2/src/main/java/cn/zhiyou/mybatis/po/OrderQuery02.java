package cn.zhiyou.mybatis.po;

public class OrderQuery02 extends Order{
	
	private TbUser user;

	public TbUser getUser() {
		return user;
	}

	public void setUser(TbUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderQuery02 [user=" + user + "]";
	}

}
