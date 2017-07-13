package com.papillon.dc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by papillon on 7/12/2017.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLogin(){
        return "login";
    }
}
