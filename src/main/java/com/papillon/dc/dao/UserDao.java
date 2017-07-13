package com.papillon.dc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by papillon on 5/16/2017.
 */
@Repository("UserDao")
public class UserDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public UserDao(){
        System.out.println("success userDao");
    }

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        System.out.println("success userDao JNDI bean autowired");
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Transactional
    public boolean create(User user){
        BeanPropertySqlParameterSource beanPropertySqlParameterSource =
                new BeanPropertySqlParameterSource(user);
        namedParameterJdbcTemplate
                .update("insert into users(username,password,enabled) " +
                                "values (:username,:password,:enabled)",
                        beanPropertySqlParameterSource);
        return namedParameterJdbcTemplate
                .update("insert into authorities(username,authority) " +
                                "values (:username,:authority)",
                        beanPropertySqlParameterSource) == 1;
    }
}
