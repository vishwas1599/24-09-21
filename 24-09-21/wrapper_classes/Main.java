package com.thbs.mainpack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=10;

       /* //boxing
        Integer wint=new Integer(i);
        System.out.println(wint);
        //unboxing
        int i1=wint.intValue();
        System.out.println(i1);
        //autoboxing
        Integer w1=123;
        int i2=w1.intValue();


        String s="123";
        int n1=Integer.parseInt(s);
        int n2=Integer.valueOf(s).intValue();//print and get the result
        */

        //from udemy
        //boxing
        int l=10;
        Integer m=Integer.valueOf(l);
        System.out.println(m);
        //unboxing
        int n=m.intValue();
        System.out.println(n);
        //auto-boxing
        int o=20;
        Integer p=o;
        System.out.println(p);
        //auto-unboxing
        int q=p;
        System.out.println(q);
    }
}
