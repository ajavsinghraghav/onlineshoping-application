package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exception;

public class PriceNotFoundException extends RuntimeException{
    public PriceNotFoundException(String message){
        super(message);
        System.out.println("hello expection");

    }
}
