package com.guico.omghelper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class WebController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return """
                <H1>Hello, this is OhMyGPT Help Page</H1>
                """;
    }

    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
