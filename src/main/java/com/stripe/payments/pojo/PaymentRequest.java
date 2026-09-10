package com.stripe.payments.pojo;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class PaymentRequest {

    @NotBlank(message = "successUrl must not be blank")
    @Pattern(
        regexp = "^(https?://).+$",
        message = "successUrl must be a valid HTTP or HTTPS URL"
    )
    private String successUrl;

    @NotBlank(message = "cancelUrl must not be blank")
    @Pattern(
        regexp = "^(https?://).+$",
        message = "cancelUrl must be a valid HTTP or HTTPS URL"
    )
    private String cancelUrl;

    @NotEmpty(message = "lineItems must contain at least one item")
    @Valid
    private List<LineItem> lineItems;
}
