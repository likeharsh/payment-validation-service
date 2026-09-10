package com.stripe.payments.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Simple POJO representing an error response.
 */
@Data
@AllArgsConstructor
public class ErrorResponse{

    private String errorCode;
    private String errorMessage;
}
