package com.thbs.emppack;

import com.thbs.exceptionpack.insufficientleave_exception;

public class employee {
    private int emp_id;
    private int b_leave;

    public employee(int emp_id, int b_leave) {
        this.emp_id = emp_id;
        this.b_leave = b_leave;
    }

    public String apply_leave(int n) throws insufficientleave_exception {
        if(b_leave<=n)
          throw  new insufficientleave_exception("Insufficient leave ...");
        else
        {
            b_leave-=n;
            return ("Leave sanctioned....");
        }
    }


    @Override
    public String toString() {
        return "employee{" +
                "emp_id=" + emp_id +
                ", b_leave=" + b_leave +
                '}';
    }
}
