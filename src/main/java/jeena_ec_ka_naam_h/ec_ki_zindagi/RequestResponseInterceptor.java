package jeena_ec_ka_naam_h.ec_ki_zindagi;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Arrays;

@Component
public class RequestResponseInterceptor implements HandlerInterceptor {

    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("PreHandlerRequest Cookies = [" + Arrays.toString(request.getCookies()) + "]");
        LOG.info("PreHandlerRequest URI = [" + request.getRequestURI() + "]");
    return true;
    }
}
