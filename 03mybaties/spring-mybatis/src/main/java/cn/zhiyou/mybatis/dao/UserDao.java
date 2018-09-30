package cn.zhiyou.mybatis.dao;

import java.util.List;

import cn.zhiyou.mybatis.po.TbUser;

public interface UserDao {
	
	/**
	 * 根据主键查找用户
	 * @param id
	 * @return
	 */
	public TbUser findUserById(Long id);
	
	public List<TbUser> findUserByName(String userName);
	
	public void addUser(TbUser user);
	
	public void updateUser(TbUser user);
	
	public void deleteUser(Long id);
}
