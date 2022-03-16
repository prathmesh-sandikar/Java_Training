//Exceptio handling using throw
package com.harman.batch4;

public class Throw {
    public static void main(String[] args) {

        int age=10;
        if(age<18){
            throw new ArithmeticException("Not eligible to VOTE");
        }
    }
}
