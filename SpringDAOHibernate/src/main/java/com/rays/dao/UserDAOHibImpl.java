package com.rays.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rays.dto.UserDTO;

public class UserDAOHibImpl implements UserDAOInt {

	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {
		Long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public void delete(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public List search(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer nextPk(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByPk(long pk) {
		// TODO Auto-generated method stub
		return null;
	}

}
