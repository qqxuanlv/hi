package com.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.Jedis;
import utils.redis.CacheUtils;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private Jedis jedis;
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


    @RequestMapping("redis")
    public String redisTest() {
        try {
            jedis.auth("8954036abc!@#..");
            jedis.set("a","ssss");
            String sa = jedis.get("a");
            logger.info(sa);
            System.out.println(sa);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return "hello";
    }
}
