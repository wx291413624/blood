package com.example;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by little-bb on 17-5-2.
 */
@RequestMapping("test")
@RestController
public class TestController {


    @RequestMapping("test")
    public String hello() {
        return "Hello! Docker!";
    }


}
