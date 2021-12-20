package com.fakecompany.micro.person.exception;

public class DataNotFoundException extends GeneralRuntimeException{

    private static final long serialVersionUID = 1L;

    public DataNotFoundException(String message){
        super(DataNotFoundException.class,message);
    }

}