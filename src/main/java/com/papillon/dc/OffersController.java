package com.papillon.dc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by papillon on 5/17/2017.
 */
@Controller
public class OffersController {

    @RequestMapping("/")
    public String showHome(){
        System.out.println("received");
        return "index";
    }
}
