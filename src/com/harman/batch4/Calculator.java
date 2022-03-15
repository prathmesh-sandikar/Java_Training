package com.harman.batch4;

import java.util.Scanner;

public class Calculator extends ParentCalculator{

    public static void main(String[] args) {


//      Addition adcalc = new Addition(); //Creating Object
//            Subtraction subcalc = new Subtraction();
//     Multiplication multc  = new Multiplication();
//        Division divcalc = new Division();
//
        Calculator ob=new Calculator();
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter num1: ");
        n1 = input.nextInt();

        System.out.println("Enter num2: ");
        n2 = input.nextInt();

        int result1 = ob.AddOperation(n1, n2);
        int result2 = ob.SubOperation(n1, n2);
        int result3 =ob.MultOperation(n1, n2);
        int result4 = ob.DivOperation(n1, n2);

        System.out.println("Addition is : "+ result1);
        System.out.println("Subtraction is: "+ result2);
        System.out.println("multuplication is : "+ result3);
        System.out.println("Division is : "+ result4);
    }
}
