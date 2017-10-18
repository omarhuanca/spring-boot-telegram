package com.example.bot.demo.conttreller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainContreller {


    @RequestMapping(value = "/")
    public String testit(){


        return "ok successful";
    }


}
