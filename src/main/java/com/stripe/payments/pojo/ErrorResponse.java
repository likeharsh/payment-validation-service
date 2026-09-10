package com.stripe.payments.pojo;

import lombok.Data;

/**
 * Simple POJO representing an error response.
 */
@Data
public class ErrorResponse{

    private String errorCode;
    private String errorMessage;
}
