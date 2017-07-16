package com.papillon.dc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.security.crypto.password.PasswordEncoder;
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
    private PasswordEncoder passwordEncoder;

    public UserDao(){
        System.out.println("success userDao");
    }

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        System.out.println("success userDao JNDI bean autowired");
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public boolean create(User user){
        MapSqlParameterSource parameterSource =
                new MapSqlParameterSource();
        parameterSource.addValue("username",user.getUsername());
        parameterSource.addValue("password",passwordEncoder.encode(user.getPassword()));
        parameterSource.addValue("email",user.getEmail());
        parameterSource.addValue("enabled",user.isEnabled());
        parameterSource.addValue("authority",user.getAuthority());

        namedParameterJdbcTemplate
                .update("insert into users(username,password,enabled) " +
                                "values (:username,:password,:enabled)",
                        parameterSource);
        return namedParameterJdbcTemplate
                .update("insert into authorities(username,authority) " +
                                "values (:username,:authority)",
                        parameterSource) == 1;
    }

    public boolean exists(String username){
        return namedParameterJdbcTemplate
                .queryForObject("select count(*) from users where username=:username",
                        new MapSqlParameterSource("username",username),Integer.class) == 1;
    }

    public List<User> getAllUsers() {
        return namedParameterJdbcTemplate
                .query("select * from users,authorities where users.username=authorities.username",
                        BeanPropertyRowMapper.newInstance(User.class));
    }
}
