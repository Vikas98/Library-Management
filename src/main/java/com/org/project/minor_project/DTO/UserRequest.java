package com.org.project.minor_project.DTO;

import com.org.project.minor_project.Model.User;
import com.org.project.minor_project.Model.UserStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserRequest {

    private String userName;

    @NotBlank(message = "user phone number should not be blank")
    private String phoneNo;

    private String email;

    private String address;

    @NotBlank(message =  "User password should  not be blank")
    private  String password;

    public User toUser()
    {
        return User.
                builder().
                name(this.userName).
                email(this.email).
                phoneNo(this.phoneNo).
                address(this.address).
                userStatus(UserStatus.ACTIVE).
                build();
    }
}
