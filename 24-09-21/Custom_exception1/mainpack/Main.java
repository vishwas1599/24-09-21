package com.thbs.mainpack;

import com.thbs.emppack.employee;
import com.thbs.exceptionpack.insufficientleave_exception;

public class Main {

    public static void main(String[] args) {
	// write your code here
        employee e1=new employee(121,15);
        System.out.println(e1);

        try {
            System.out.println(e1.apply_leave(2));
        } catch (insufficientleave_exception e) {
            e.printStackTrace();
        }

        System.out.println(e1);
    }
}
