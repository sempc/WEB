package com.servlet.service;

import java.sql.SQLException;

import com.servlet.dao.MemberDAO;
import com.servlet.dto.MemberVO;
import com.servlet.exception.InvalidPasswordException;
import com.servlet.exception.NotFoundIDException;

public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO; // = MemberDAOImpl.getInstance();
	
	
	@Override
	public MemberVO login(String id, String pwd) throws NotFoundIDException, InvalidPasswordException, SQLException {
		
		return null;
	}

}
