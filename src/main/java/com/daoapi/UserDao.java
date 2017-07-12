package com.daoapi;

import com.entities.User;

import java.sql.SQLException;

public interface UserDao {

	boolean save(User user);

	User findByID(Integer id);

	User findByUserNameAndPass(String userName, String password) throws SQLException;

}
