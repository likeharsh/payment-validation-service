package com.stripe.payments.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class User {

    @NotBlank(message = "END_USER_ID_REQUIRED")
    @Size(
        min = 1,
        max = 100,
        message = "END_USER_ID_SIZE_INVALID"
    )
    private String endUserID;

    @NotBlank(message = "FIRSTNAME_REQUIRED")
    @Size(
        min = 1,
        max = 50,
        message = "FIRSTNAME_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[a-zA-Z]+(?:[ '-][a-zA-Z]+)*$",
        message = "FIRSTNAME_INVALID"
    )
    private String firstname;

    @NotBlank(message = "LASTNAME_REQUIRED")
    @Size(
        min = 1,
        max = 50,
        message = "LASTNAME_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[a-zA-Z]+(?:[ '-][a-zA-Z]+)*$",
        message = "LASTNAME_INVALID"
    )
    private String lastname;

    @NotBlank(message = "EMAIL_REQUIRED")
    @Size(
        max = 254,
        message = "EMAIL_SIZE_INVALID"
    )
    @Email(message = "EMAIL_INVALID")
    private String email;

    @NotBlank(message = "MOBILE_PHONE_REQUIRED")
    @Size(
        min = 7,
        max = 16,
        message = "MOBILE_PHONE_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^\\+?[0-9]{7,15}$",
        message = "MOBILE_PHONE_INVALID"
    )
    private String mobilePhone;
}