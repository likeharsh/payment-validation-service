package com.stripe.payments.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class LineItem {

	@NotBlank(message = "currency must not be blank")
    @Pattern(
        regexp = "^[a-zA-Z]{3}$",
        message = "currency must be a valid 3-letter currency code"
    )
    private String currency;

    @NotBlank(message = "productName must not be blank")
    private String productName;

    @Positive(message = "unitAmount must be greater than 0")
    private int unitAmount;

    @Positive(message = "quantity must be greater than 0")
    private int quantity;
}
