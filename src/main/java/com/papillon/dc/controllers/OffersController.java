package com.papillon.dc.controllers;

import com.papillon.dc.dao.Offer;
import com.papillon.dc.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by papillon on 5/17/2017.
 */
@Controller
public class OffersController {

    private OffersService offersService;

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping("/")
    public String showHome(HttpSession session, Model model){
        /*session.setAttribute("name","debaspreet");
        model.addAttribute("name","<b>devopreet</b>");
        return "index";*/
        /*ModelAndView mv = new ModelAndView("index");
        Map<String,Object> map = mv.getModel();
        map.put("name","<b>debas</b>");
        System.out.println("received");
        return mv;*/

        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers",offers);
        return "index";
    }
}
