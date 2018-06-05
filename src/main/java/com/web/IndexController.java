package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(){
        System.out.println("index");
        return "index";
    }
    @GetMapping("/index2")
    public String index2(){
        System.out.println("index2.....");
        return "index2";
    }



    @GetMapping("/index/{id}")
    public String index3(){
        return null;
    }
}
