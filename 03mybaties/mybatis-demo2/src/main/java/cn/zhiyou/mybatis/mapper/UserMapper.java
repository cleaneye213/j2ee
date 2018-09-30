package cn.zhiyou.mybatis.mapper;

import java.util.List;
import java.util.Map;

import cn.zhiyou.mybatis.po.TbUser;
import cn.zhiyou.mybatis.po.UserQuery;

public interface UserMapper {

	/**
	 * 根据主键查找用户
	 * @param id
	 * @return
	 */
	public TbUser findUserById(Long id);
	
	public List<TbUser> findUserByName(String userName);
	
	public void addUser(TbUser user);
	
	public int updateUser(TbUser user);
	
	public void deleteUser(Long id);
	
	public List<TbUser> queryUserBy(UserQuery user);
	
	public List<TbUser>  queryUserByMap(Map<String,Object> map);
	
	public List<String> queryUserName(String userName);
	
	public List<TbUser> selectAllUser();
	
	public List<TbUser> queryUserList(UserQuery user);
	
	public List<TbUser> queryUserByIds(UserQuery user);
	
	public List<TbUser> queryUserGoodsInfo();
}
