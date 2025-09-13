package com.springcore.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User(rs.getString("username"),
                rs.getString("password"),
                rs.getString("fullname"),
                rs.getString("email"));
        return user;
    }
}
