package com.rays.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
public class UserServiceImpl implements UserServiceInt{
	@Autowired
	private UserDAOInt dao = null;

	@Transactional(propagation =Propagation.REQUIRED)
	public long add(UserDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}
	@Transactional(propagation =Propagation.REQUIRED)
	public void update(UserDTO dto) {
		dao.update(dto);
	
		
	}
	public void delete(UserDTO dto) {
		dao.delete(dto);
		
	}
	public List search(UserDTO dto) {
	List list =	dao.search(dto);
		return list;
	}
	public Integer nextPk(UserDTO dto) {
	Integer pk =	dao.nextPk(dto);
		return pk;
	}
	@Transactional
	public UserDTO findByPk(long pk) {
		// TODO Auto-generated method stub
		return dao.findByPk(pk);
	}

}
