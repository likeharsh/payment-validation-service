package com.stripe.payments.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    SUCCESS_URL_REQUIRED("1001", "successUrl must not be blank"),
    SUCCESS_URL_INVALID("1002", "successUrl must be a valid HTTP or HTTPS URL"),

    CANCEL_URL_REQUIRED("1003", "cancelUrl must not be blank"),
    CANCEL_URL_INVALID("1004", "cancelUrl must be a valid HTTP or HTTPS URL"),

    LINE_ITEMS_REQUIRED("1005", "lineItems must contain at least one item"),

    CURRENCY_REQUIRED("1006", "currency must not be blank"),
    CURRENCY_INVALID("1007", "currency must be a valid 3-letter currency code"),

    PRODUCT_NAME_REQUIRED("1008", "productName must not be blank"),

    UNIT_AMOUNT_INVALID("1009", "unitAmount must be greater than 0"),
    UNIT_AMOUNT_NULL("1010", "unitAmount must not be null"),

    QUANTITY_INVALID("1011", "quantity must be greater than 0"),
	QUANTITY_NULL("1012", "quantity must not be null");

    private final String errorCode;
    private final String errorMessage;
}