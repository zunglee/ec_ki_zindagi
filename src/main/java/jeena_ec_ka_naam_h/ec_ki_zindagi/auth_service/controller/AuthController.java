package jeena_ec_ka_naam_h.ec_ki_zindagi.auth_service.controller;

import jeena_ec_ka_naam_h.ec_ki_zindagi.auth_service.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @RequestMapping("/v0/auth")
    @ResponseBody
    public String Authenticate(String entity , String key){
        System.out.println("In Authenticate Controller");
        String authStr = "Auth Service";
        Object data = authService.Authenticate(entity,key);
        return authStr;
    }
}
