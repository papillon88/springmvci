package com.papillon.dc.controllers;

import com.papillon.dc.dao.Offer;
import com.papillon.dc.dao.User;
import com.papillon.dc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/newaccount")
    public String showNewAccount(Model model){
        model.addAttribute("user", new User());
        return "newaccount";
    }

    @RequestMapping(value = "/createaccount",method = RequestMethod.POST)
    public String createAccount(@Valid User user,BindingResult result){
        if(result.hasErrors()){
            return "newaccount";
        } else {
            user.setEnabled(true);
            user.setAuthority("user");
            userService.create(user);
            return "accountcreated";
        }
    }
}
