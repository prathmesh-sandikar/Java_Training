//Exception Handling
package com.harman.batch4;

public class Check {
    public static void main(String[] args) {
       try {
           String name=null;
           System.out.println(name.length());
       }
       catch (ArithmeticException e)
       {
           System.out.println("Divisible by 0 not possible");
       }
       catch (NullPointerException e){
           System.out.println("Null value is not accepted");
       }
       catch (Exception e){
           System.out.println(e);
       }
       finally {
           System.out.println("harman");
       }
    }
}
