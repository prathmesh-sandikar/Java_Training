//Write a Java program that create two integers greater than 10000  and then prints the sum, the difference, the product, the average,

import java.util.Scanner;

public class Integer {



        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
//
            System.out.print("Input 1st integer: ");
            int firstInt = in.nextInt();
            System.out.print("Input 2nd integer: ");
            int secondInt = in.nextInt();

            System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
            System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
            System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
            System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        }
}

