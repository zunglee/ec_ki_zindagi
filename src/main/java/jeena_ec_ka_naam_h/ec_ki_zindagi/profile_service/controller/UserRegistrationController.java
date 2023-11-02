package jeena_ec_ka_naam_h.ec_ki_zindagi.profile_service.controller;

import jeena_ec_ka_naam_h.ec_ki_zindagi.profile_service.model.UserRegisterDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRegistrationController {

    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());
    @PostMapping("/register")
    public ResponseEntity UserRegistration(@RequestBody UserRegisterDto userRegisterDto){
        LOG.info(userRegisterDto.toString());
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
