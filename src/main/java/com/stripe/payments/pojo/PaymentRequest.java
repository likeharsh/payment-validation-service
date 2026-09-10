package com.stripe.payments.pojo;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class PaymentRequest {

    @NotBlank(message = "SUCCESS_URL_REQUIRED")
    @Pattern(
        regexp = "^(https?://).+$",
        message = "SUCCESS_URL_INVALID"
    )
    private String successUrl;

    @NotBlank(message = "CANCEL_URL_REQUIRED")
    @Pattern(
        regexp = "^(https?://).+$",
        message = "CANCEL_URL_INVALID"
    )
    private String cancelUrl;

    @NotEmpty(message = "LINE_ITEMS_REQUIRED")
    @Valid
    private List<LineItem> lineItems;
}