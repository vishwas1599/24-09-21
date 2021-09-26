package com.thbs.exceptionpack;
//this exception is registered as checked excpetion
public class insufficientleave_exception extends Exception{
    private String msg;


    public insufficientleave_exception(String msg)
    {
        this.msg=msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
