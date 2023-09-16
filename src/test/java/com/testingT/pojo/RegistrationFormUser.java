package com.testingT.pojo;

import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class RegistrationFormUser {

    private String firstName;
    private String lastName;
    private String userEmail;

}
