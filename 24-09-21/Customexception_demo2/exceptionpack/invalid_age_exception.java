package com.thbs.exceptionpack;

public class invalid_age_exception extends Exception {

    private String msg;
    public invalid_age_exception(String msg)
    {
        this.msg=msg;

    }

    @Override
    public String getMessage() {
        return msg ;
    }
}
