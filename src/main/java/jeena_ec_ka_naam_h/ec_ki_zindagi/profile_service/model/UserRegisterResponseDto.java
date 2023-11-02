package jeena_ec_ka_naam_h.ec_ki_zindagi.profile_service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserRegisterResponseDto {
    private String name;
    private String emailId;
    private String msg ;
    private int code;
}
