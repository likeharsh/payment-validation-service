package com.stripe.payments.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class LineItem {

    @NotBlank(message = "CURRENCY_REQUIRED")
    @Size(
        min = 3,
        max = 3,
        message = "CURRENCY_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[A-Za-z]{3}$",
        message = "CURRENCY_INVALID"
    )
    private String currency;

    @NotBlank(message = "PRODUCT_NAME_REQUIRED")
    @Size(
        min = 1,
        max = 200,
        message = "PRODUCT_NAME_SIZE_INVALID"
    )
    private String productName;

    @NotNull(message = "UNIT_AMOUNT_NULL")
    @Positive(message = "UNIT_AMOUNT_INVALID")
    private Integer unitAmount;

    @NotNull(message = "QUANTITY_NULL")
    @Positive(message = "QUANTITY_INVALID")
    private Integer quantity;
}