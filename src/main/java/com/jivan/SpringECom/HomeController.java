package com.jivan.SpringECom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String homeMessage() {
        return "<h1>Hello From Home Page.</h1>";
    }

    @RequestMapping("/about")
    public String aboutMessage() {
        return "<h2 style='color: red; font-size: 32px;'>This is about page.</h2>";
    }
}
