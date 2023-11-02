package jeena_ec_ka_naam_h.ec_ki_zindagi.auth_service.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public AuthService(){
        System.out.println("In Auth Service");
    }


    public Boolean Authenticate(String entity, String key){
return true;
    }
}
