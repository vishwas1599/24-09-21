package com.thbs.mainpack;

import com.thbs.cpack.citizen;
import com.thbs.exceptionpack.invalid_age_exception;

public class Main {

    public static void main(String[] args) {
	// write your code here
    citizen c1=new citizen(123445,"Vishwas",12);

        System.out.println(c1);
        try {
            System.out.println(c1.getLicense());
        } catch (invalid_age_exception e) {
            System.out.println(e.getMessage());
        }


    }
}
