package com.hanbo.blog.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hanbo.blog.dao.UserDao;
import com.hanbo.blog.entity.User;

@Service("userDao")
public class UserService implements UserDao{

	@Resource
	private UserDao userDao;
	
	public User getUserById(int userId){
		return userDao.getUserById(userId);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
