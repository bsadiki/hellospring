package com.sadiki.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/helloWorld")
    String getView(Model model) {
        model.addAttribute("msg", "Hello there");
        return "helloworld";
    }
}
