package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/index")
    public String index(){
        return "";
    }
    @GetMapping("/hello")
    public String hello(){
        return "HELLO WORLD";
    }


}
