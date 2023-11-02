package jeena_ec_ka_naam_h.ec_ki_zindagi.homepage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageController {

    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());
    @GetMapping("/login")
    public String Login(){
        return "loginPage";

    }




}
