package cn.zhiyou.mybatis.po;

import java.util.List;

public class UserQuery {

	private TbUser user;
	
	private List<Long> ids;

	public TbUser getTbUser() {
		return user;
	}

	public void setTbUser(TbUser tbUser) {
		this.user = tbUser;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
	
	
}
