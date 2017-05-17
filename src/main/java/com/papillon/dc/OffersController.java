package com.papillon.dc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by papillon on 5/17/2017.
 */
@Controller
public class OffersController {

    @RequestMapping("/")
    public String showHome(HttpSession session, Model model){
        session.setAttribute("name","debaspreet");
        model.addAttribute("name","devopreet");
        return "index";
        /*ModelAndView mv = new ModelAndView("index");
        Map<String,Object> map = mv.getModel();
        map.put("name","<b>debas</b>");
        System.out.println("received");
        return mv;*/
    }
}
