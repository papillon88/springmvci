package com.papillon.dc.service;

import com.papillon.dc.dao.Offer;
import com.papillon.dc.dao.OfferDao;
import com.papillon.dc.dao.User;
import com.papillon.dc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by papillon on 5/17/2017.
 */
@Service("userService")
public class UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void create(User user){userDao.create(user);}

    public boolean exists(String username){
        return userDao.exists(username);
    }

    @Secured("ROLE_ADMIN")
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
