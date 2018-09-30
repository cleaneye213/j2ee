package cn.zhiyou.mybatis.po;

public class OrderQuery01 extends Order{

	private String username;
    private String sex;
	public String getUsername() {
		return username;
	}
	public String getSex() {
		return sex;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "OrderQuery01 [username=" + username + ", sex=" + sex + "]";
	}

    
}
