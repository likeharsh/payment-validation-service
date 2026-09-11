package com.stripe.payments.pojo;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class Payment {

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

    @NotNull(message = "AMOUNT_NULL")
    @Positive(message = "AMOUNT_INVALID")
    private Integer amount;

    @NotBlank(message = "BRAND_NAME_REQUIRED")
    @Size(
        min = 1,
        max = 100,
        message = "BRAND_NAME_SIZE_INVALID"
    )
    private String brandName;

    @NotBlank(message = "LOCALE_REQUIRED")
    @Pattern(
        regexp = "^[a-z]{2,3}-[A-Z]{2}$",
        message = "LOCALE_INVALID"
    )
    private String locale;

    @NotBlank(message = "COUNTRY_REQUIRED")
    @Size(
        min = 2,
        max = 2,
        message = "COUNTRY_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[A-Z]{2}$",
        message = "COUNTRY_INVALID"
    )
    private String country;

    @NotBlank(message = "MERCHANT_TXN_REF_REQUIRED")
    @Size(
        min = 1,
        max = 100,
        message = "MERCHANT_TXN_REF_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[A-Za-z0-9_-]+$",
        message = "MERCHANT_TXN_REF_INVALID"
    )
    private String merchantTxnRef;

    @NotBlank(message = "PAYMENT_METHOD_REQUIRED")
    @Size(
        min = 1,
        max = 50,
        message = "PAYMENT_METHOD_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[A-Za-z0-9_-]+$",
        message = "PAYMENT_METHOD_INVALID"
    )
    private String paymentMethod;

    @NotBlank(message = "PROVIDER_REQUIRED")
    @Size(
        min = 1,
        max = 50,
        message = "PROVIDER_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[A-Za-z0-9_-]+$",
        message = "PROVIDER_INVALID"
    )
    private String provider;

    @NotBlank(message = "PAYMENT_TYPE_REQUIRED")
    @Size(
        min = 1,
        max = 50,
        message = "PAYMENT_TYPE_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^[A-Za-z0-9_-]+$",
        message = "PAYMENT_TYPE_INVALID"
    )
    private String paymentType;

    @NotBlank(message = "SUCCESS_URL_REQUIRED")
    @Size(
        max = 2048,
        message = "SUCCESS_URL_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^https?://.+$",
        message = "SUCCESS_URL_INVALID"
    )
    private String successUrl;

    @NotBlank(message = "CANCEL_URL_REQUIRED")
    @Size(
        max = 2048,
        message = "CANCEL_URL_SIZE_INVALID"
    )
    @Pattern(
        regexp = "^https?://.+$",
        message = "CANCEL_URL_INVALID"
    )
    private String cancelUrl;

    @NotEmpty(message = "LINE_ITEMS_REQUIRED")
    @Valid
    private List<LineItem> lineItems;
}