package com.servlet.dao;

import java.sql.SQLException;

import com.servlet.dto.MemberVO;

public interface MemberDAO {
	
	
	MemberVO selectMemberByID(String id)throws SQLException;
}
