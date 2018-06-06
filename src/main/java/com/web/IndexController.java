package com.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/index")
    public String index(){

        System.out.println("index");

        logger.info("ssss");
        logger.error("ssss");
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
