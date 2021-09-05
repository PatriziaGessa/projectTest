package patrizia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private boolean pageWasAccessed;

    @RequestMapping("/simplehome")
    public String getHome(Model model) {
        if (pageWasAccessed) {
            model.addAttribute("firstVisit", false);

        } else {
            pageWasAccessed = true;
            model.addAttribute("firstVisit", true);
        }
        return "home";
    }
}
