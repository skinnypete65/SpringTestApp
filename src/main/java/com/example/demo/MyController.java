package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @PostMapping("/result")
    public @ResponseBody
    String getAuth(@RequestParam String login, @RequestParam String pass){
        if(login.equals("user") && pass.equals("123")){
            return "Auth success!";
        }
        else {
            return "Access denied";
        }
    }
}
