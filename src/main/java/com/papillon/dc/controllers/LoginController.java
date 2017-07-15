package com.papillon.dc.controllers;

import com.papillon.dc.dao.Offer;
import com.papillon.dc.dao.User;
import com.papillon.dc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by papillon on 7/12/2017.
 */
@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/newaccount")
    public String showNewAccount(Model model) {
        model.addAttribute("user", new User());
        return "newaccount";
    }

    @RequestMapping(value = "/loggedout")
    public String showLoggedOut(){
        return "loggedout";
    }

    @RequestMapping("/admin")
    public String showAdmin(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users",users);
        return "admin";
    }

    @RequestMapping(value = "/createaccount", method = RequestMethod.POST)
    public String createAccount(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "newaccount";
        }
        user.setEnabled(true);
        user.setAuthority("user");

        if(userService.exists(user.getUsername())){
            result.rejectValue("username","DuplicateKey.user.username","This username already exixts");
            return "newaccount";
        }
        //backup duplicate user name error handling
        try {
            userService.create(user);
            return "accountcreated";
        } catch (DuplicateKeyException e) {
            System.out.println(e.getClass());
            result.rejectValue("username","DuplicateKey.user.username","This username already exixts");
        }
        //end of backup
        return "newaccount";
    }
}
