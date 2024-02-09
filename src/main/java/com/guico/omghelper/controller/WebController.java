package com.guico.omghelper.controller;

import com.guico.omghelper.mapper.CardsMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class WebController {
    private CardsMapper mapper;



    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("cards", mapper.list());
        return "index";
    }


}
