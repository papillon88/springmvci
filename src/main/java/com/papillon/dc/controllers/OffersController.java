package com.papillon.dc.controllers;

import com.papillon.dc.dao.Offer;
import com.papillon.dc.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
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

    @RequestMapping("/offers")
    public String showOffers(HttpSession session, Model model){
        /*session.setAttribute("name","debaspreet");
        model.addAttribute("name","<b>devopreet</b>");
        return "index";*/
        /*ModelAndView mv = new ModelAndView("index");
        Map<String,Object> map = mv.getModel();
        map.put("name","<b>debas</b>");
        System.out.println("received");
        return mv;*/
        offersService.throwTestException();
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers",offers);
        return "offers";
    }

    @RequestMapping("/createoffer")
    public String crateOffer(HttpSession session, Model model){
        model.addAttribute("offer",new Offer());
        return "createoffer";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String showTest(HttpSession session, Model model, @RequestParam("id") String id){
        System.out.println(id);
        return "index";
    }

    @RequestMapping(value = "/docreate",method = RequestMethod.POST)
    public String doCreate(Model model, @Valid Offer offer, BindingResult result){
        if(result.hasErrors()){
            System.out.println("Form does not validate");
            List<ObjectError> errors = result.getAllErrors();
            for(ObjectError error : errors){
                System.out.println(error.getDefaultMessage());
            }
            return "createoffer";
        } else {
            System.out.println("Form does validate");
            System.out.println(offer);
            offersService.create(offer);
            return "offercreated";
        }
    }
}
