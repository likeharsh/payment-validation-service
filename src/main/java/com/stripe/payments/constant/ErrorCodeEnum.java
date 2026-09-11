package com.stripe.payments.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

	// Request validation
	USER_REQUIRED(
			"1001",
			"user must not be null"
			),

	PAYMENT_REQUIRED(
			"1002",
			"payment must not be null"
			),

	// User validation
	END_USER_ID_REQUIRED(
			"1003",
			"endUserID must not be blank"
			),

	END_USER_ID_SIZE_INVALID(
			"1004",
			"endUserID must not exceed 100 characters"
			),

	FIRSTNAME_REQUIRED(
			"1005",
			"firstname must not be blank"
			),

	FIRSTNAME_SIZE_INVALID(
			"1006",
			"firstname must not exceed 50 characters"
			),

	FIRSTNAME_INVALID(
			"1007",
			"firstname contains invalid characters"
			),

	LASTNAME_REQUIRED(
			"1008",
			"lastname must not be blank"
			),

	LASTNAME_SIZE_INVALID(
			"1009",
			"lastname must not exceed 50 characters"
			),

	LASTNAME_INVALID(
			"1010",
			"lastname contains invalid characters"
			),

	EMAIL_REQUIRED(
			"1011",
			"email must not be blank"
			),

	EMAIL_SIZE_INVALID(
			"1012",
			"email must not exceed 254 characters"
			),

	EMAIL_INVALID(
			"1013",
			"email must be valid"
			),

	MOBILE_PHONE_REQUIRED(
			"1014",
			"mobilePhone must not be blank"
			),

	MOBILE_PHONE_SIZE_INVALID(
			"1015",
			"mobilePhone must contain between 7 and 16 characters"
			),

	MOBILE_PHONE_INVALID(
			"1016",
			"mobilePhone must contain a valid phone number"
			),

	// Payment validation
	CURRENCY_REQUIRED(
			"1017",
			"currency must not be blank"
			),

	CURRENCY_SIZE_INVALID(
			"1018",
			"currency must contain exactly 3 characters"
			),

	CURRENCY_INVALID(
			"1019",
			"currency must contain only alphabetic characters"
			),

	AMOUNT_NULL(
			"1020",
			"amount must not be null"
			),

	AMOUNT_INVALID(
			"1021",
			"amount must be greater than 0"
			),

	BRAND_NAME_REQUIRED(
			"1022",
			"brandName must not be blank"
			),

	BRAND_NAME_SIZE_INVALID(
			"1023",
			"brandName must not exceed 100 characters"
			),

	LOCALE_REQUIRED(
			"1024",
			"locale must not be blank"
			),

	LOCALE_INVALID(
			"1025",
			"locale must be in a valid format such as en-US"
			),

	COUNTRY_REQUIRED(
			"1026",
			"country must not be blank"
			),

	COUNTRY_SIZE_INVALID(
			"1027",
			"country must contain exactly 2 characters"
			),

	COUNTRY_INVALID(
			"1028",
			"country must contain a valid two-letter country code format"
			),

	MERCHANT_TXN_REF_REQUIRED(
			"1029",
			"merchantTxnRef must not be blank"
			),

	MERCHANT_TXN_REF_SIZE_INVALID(
			"1030",
			"merchantTxnRef must not exceed 100 characters"
			),

	MERCHANT_TXN_REF_INVALID(
			"1031",
			"merchantTxnRef contains invalid characters"
			),

	PAYMENT_METHOD_REQUIRED(
			"1032",
			"paymentMethod must not be blank"
			),

	PAYMENT_METHOD_SIZE_INVALID(
			"1033",
			"paymentMethod must not exceed 50 characters"
			),

	PAYMENT_METHOD_INVALID(
			"1034",
			"paymentMethod contains invalid characters"
			),

	PROVIDER_REQUIRED(
			"1035",
			"provider must not be blank"
			),

	PROVIDER_SIZE_INVALID(
			"1036",
			"provider must not exceed 50 characters"
			),

	PROVIDER_INVALID(
			"1037",
			"provider contains invalid characters"
			),

	PAYMENT_TYPE_REQUIRED(
			"1038",
			"paymentType must not be blank"
			),

	PAYMENT_TYPE_SIZE_INVALID(
			"1039",
			"paymentType must not exceed 50 characters"
			),

	PAYMENT_TYPE_INVALID(
			"1040",
			"paymentType contains invalid characters"
			),

	// URLs
	SUCCESS_URL_REQUIRED(
			"1041",
			"successUrl must not be blank"
			),

	SUCCESS_URL_SIZE_INVALID(
			"1042",
			"successUrl must not exceed 2048 characters"
			),

	SUCCESS_URL_INVALID(
			"1043",
			"successUrl must be a valid HTTP or HTTPS URL"
			),

	CANCEL_URL_REQUIRED(
			"1044",
			"cancelUrl must not be blank"
			),

	CANCEL_URL_SIZE_INVALID(
			"1045",
			"cancelUrl must not exceed 2048 characters"
			),

	CANCEL_URL_INVALID(
			"1046",
			"cancelUrl must be a valid HTTP or HTTPS URL"
			),

	LINE_ITEMS_REQUIRED(
			"1047",
			"lineItems must contain at least one item"
			),

	// Line item
	PRODUCT_NAME_REQUIRED(
			"1048",
			"productName must not be blank"
			),

	PRODUCT_NAME_SIZE_INVALID(
			"1049",
			"productName must not exceed 200 characters"
			),

	UNIT_AMOUNT_NULL(
			"1050",
			"unitAmount must not be null"
			),

	UNIT_AMOUNT_INVALID(
			"1051",
			"unitAmount must be greater than 0"
			),

	QUANTITY_NULL(
			"1052",
			"quantity must not be null"
			),

	QUANTITY_INVALID(
			"1053",
			"quantity must be greater than 0"
			);

	private final String errorCode;
	private final String errorMessage;
}