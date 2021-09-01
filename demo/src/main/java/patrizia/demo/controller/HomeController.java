package patrizia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/simplehome")
    public String getHome() {
        return "home";
    }
}
