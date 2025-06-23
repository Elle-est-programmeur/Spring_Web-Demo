package org.example.webdemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        String str = "msrit.edu";
        return str;
    }

    @RequestMapping("/video")
    @ResponseBody
    public String video() {
        String str = "youtube.com";
        return str;
    }
}
