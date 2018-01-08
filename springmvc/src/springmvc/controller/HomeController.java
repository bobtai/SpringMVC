package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/", "index"})
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("message", "Welcome to My Web");
        return "index";
    }
}