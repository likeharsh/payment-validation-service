package com.stripe.payments.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class LineItem {

    @NotBlank(message = "CURRENCY_REQUIRED")
    @Pattern(
        regexp = "^[a-zA-Z]{3}$",
        message = "CURRENCY_INVALID"
    )
    private String currency;

    @NotBlank(message = "PRODUCT_NAME_REQUIRED")
    private String productName;

    @NotNull(message = "UNIT_AMOUNT_NULL")
    @Positive(message = "UNIT_AMOUNT_INVALID")
    private Integer unitAmount;

    @NotNull(message = "QUANTITY_NULL")
    @Positive(message = "QUANTITY_INVALID")
    private Integer quantity;
}