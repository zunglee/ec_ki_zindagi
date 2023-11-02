package jeena_ec_ka_naam_h.ec_ki_zindagi.profile_service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class UserProfileDto {

    private Integer profileId;
    private String name;
    private String username;
    private String emailId;
    private String profileType;
    private String gender;
    private Date dob;

}
