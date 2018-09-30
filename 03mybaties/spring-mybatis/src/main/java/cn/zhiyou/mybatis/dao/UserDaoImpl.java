package cn.zhiyou.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.zhiyou.mybatis.po.TbUser;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


	@Override
	public TbUser findUserById(Long id) {
		SqlSession session = this.getSqlSession();

		TbUser user = (TbUser) session.selectOne("user.findUserById", id);
		
		return user;
	}

	@Override
	public List<TbUser> findUserByName(String userName) {
		SqlSession session = getSqlSession();
		
		List<TbUser> selectList = session.selectList("user.findUserByName", userName);

		return selectList;
	}

	@Override
	public void addUser(TbUser user) {
		SqlSession session = getSqlSession();
		
		session.insert("user.addUser", user);

		session.commit();
		session.close();

	}

	@Override
	public void updateUser(TbUser user) {
		// 生成SqlSession
		SqlSession session =getSqlSession();
		
		int count = session.update("user.updateUser", user);

		session.commit();
		session.close();
		System.out.println("更新方法" + count);

	}

	@Override
	public void deleteUser(Long id) {
		// 生成SqlSession
		SqlSession session = getSqlSession();
		int delete = session.delete("user.deleteUser", 33L);
		System.out.println("删除方法"+delete);
		
		session.commit();
		session.close();

	}

}
