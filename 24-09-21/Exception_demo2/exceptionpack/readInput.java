package com.thbs.exceptionpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readInput {


    //autoclose option
    public static void readinput1()
    {
        try(InputStreamReader ir = new InputStreamReader(System.in);  // will read one char at a time
       BufferedReader br = new BufferedReader(ir))
        {
            System.out.println("Read two input values : ");
          String str1 = br.readLine();
            String str2 = br.readLine();
            int result = Integer.parseInt(str1) / Integer.parseInt(str2);
            System.out.println(result);

        }catch (ArithmeticException e) {
            System.out.println("Denominator is zeo    " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid inputs...    " + e.getMessage());
        }
        catch(RuntimeException e)
        {
            System.out.println("Run time excep"+e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
//
public static void readInput2() throws IOException ,ArithmeticException,NumberFormatException{
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader  br = new BufferedReader(ir);
    System.out.println("Read two input values : ");
    String str1 = br.readLine();
    String str2 = br.readLine();
    int result = Integer.parseInt(str1) / Integer.parseInt(str2);
    System.out.println(result);
}


//for checked exception
    public static void readinput()
    {
        InputStreamReader ir= null;
        BufferedReader br=null;
        String str1,str2;
        try {
            ir = new InputStreamReader(System.in);  // will read one char at a time
            br = new BufferedReader(ir);  // br will be
            System.out.println("Read two input values : ");
            str1 = br.readLine();
            str2 = br.readLine();
            int result = Integer.parseInt(str1) / Integer.parseInt(str2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Denominator is zeo    " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid inputs...    " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Resource error...." + e.getMessage());
            // e.printStackTrace();
        } finally {
            try {
                ir.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}

