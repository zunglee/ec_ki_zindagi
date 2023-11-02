package jeena_ec_ka_naam_h.ec_ki_zindagi.homepage.service;

import org.springframework.stereotype.Service;

@Service
public class HomePageService {

    public String getHomePageDetail(){
        if(isLoggedIn()){
            int x = 1;
        }else{
            int x = 1;
        }
        return "All Col";
    }

    private boolean isLoggedIn(){
        return true;
    }
}
