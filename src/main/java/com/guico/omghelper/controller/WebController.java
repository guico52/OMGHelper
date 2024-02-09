package com.guico.omghelper.controller;

import com.guico.omghelper.mapper.CardsMapper;
import com.guico.omghelper.util.HtmlGenerator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class WebController {
    private HtmlGenerator htmlGenerator;
    private CardsMapper mapper;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return """
                <H1>Hello, this is OhMyGPT Help Page</H1>
                """;
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("cards", mapper.list());
        return "index";
    }

    @PostMapping("/cards")
    @ResponseBody
    public String cards(){
        return htmlGenerator.generateAllCards();
    }


}
