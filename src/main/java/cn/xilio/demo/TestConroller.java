package cn.xilio.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestConroller {
    @GetMapping("hello")
    public String hellow(){
        return "hello";
    }
}
