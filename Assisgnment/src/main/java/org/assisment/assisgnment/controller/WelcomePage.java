package org.assisment.assisgnment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePage {
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
