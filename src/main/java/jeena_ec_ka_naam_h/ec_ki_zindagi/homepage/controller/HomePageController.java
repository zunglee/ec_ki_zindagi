package jeena_ec_ka_naam_h.ec_ki_zindagi.homepage.controller;

import jeena_ec_ka_naam_h.ec_ki_zindagi.homepage.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePageController {

    @Autowired
    HomePageService homePageService;
    @RequestMapping("/")
    public String Homepage(Model model){
        System.out.println("In Home Page controller");
        Object map = homePageService.getHomePageDetail();
        model.addAttribute("hoa_version", "HVVVVVVVVVVVVVV");
        model.addAttribute("data", map);

        return "homePage";

    }


    @RequestMapping("/profile-register")
    @ResponseBody
    public String ProfileRegister(){
        return "index";
    }
}
