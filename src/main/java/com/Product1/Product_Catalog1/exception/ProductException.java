package com.Product1.Product_Catalog1.exception;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus
public class ProductException extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    public ProductException(String message)
    {
        super(message);
    }
    public ProductException(String message, Throwable throwable)
    {
        super(message,throwable);
    }
}
