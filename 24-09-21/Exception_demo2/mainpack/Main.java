package com.thbs.mainpack;

import com.thbs.exceptionpack.readInput;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //readInput.readinput();
//readInput.readinput1();

        try {
            readInput.readInput2();
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator is zeo    " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid inputs...    " + e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        }
    }

