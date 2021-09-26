package com.thbs.cpack;

import com.thbs.exceptionpack.invalid_age_exception;

public class citizen {
    private int aadhar_no;
    private String name;
    private int age;

    public citizen(int aadhar_no, String name, int age) {
        this.aadhar_no = aadhar_no;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "citizen{" +
                "aadhar_no=" + aadhar_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLicense() throws invalid_age_exception {
        if(age<18)
            throw new invalid_age_exception("License cannot be issues bcz of age");
        else if((age<=75)&& (age>=18))
            return ("Congrats Licsense approved");
        else
            throw new invalid_age_exception("Sorry,your age exceeded the limit");





    }

}
