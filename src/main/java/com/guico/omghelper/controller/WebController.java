package com.guico.omghelper.controller;

import com.guico.omghelper.util.HtmlGenerator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class WebController {
    private HtmlGenerator htmlGenerator;

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

    @PostMapping("/cards")
    @ResponseBody
    public String cards(){
        return htmlGenerator.generateAllCards();
    }


}
