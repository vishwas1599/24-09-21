package com.thbs.mainpack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result=0;
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            result = n1 / n2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator is Zero"+e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid inputs"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Insufficient inputs"+e.getMessage());
        }
        finally {
            System.out.println(result);
        }

        System.out.println("bye!!!!!!!!!!");
    }
}
