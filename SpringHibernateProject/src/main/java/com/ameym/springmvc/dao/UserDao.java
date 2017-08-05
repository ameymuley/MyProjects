package com.ameym.springmvc.dao;

import java.sql.SQLException;

import com.ameym.springmvc.viewBean.*;

public interface UserDao
{
	public boolean isValidUser(String username, String password) throws SQLException;
}

