package com.company.projects.controller;

import com.company.projects.entities.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InputController {

    @RequestMapping(value = "/greeting" ,method = RequestMethod.GET, produces = "text/html")
//    @GetMapping("/greeting")
    public @ResponseBody String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value = "/greeting" ,method = RequestMethod.POST, produces = "text/html")
    public @ResponseBody String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
