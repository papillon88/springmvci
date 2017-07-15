package com.papillon.dc.controllers;

import com.papillon.dc.dao.Offer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by papillon on 5/17/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome(HttpSession session, Model model){
        return "index";
    }

}
