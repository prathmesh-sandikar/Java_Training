//Program for square root of a number
import java.util.Scanner;

public class SquareRoot {




        public static void main(String[] args)
        {
            Double num;
            Scanner sc= new Scanner(System.in);
//

            System.out.print("Enter a number: ");
            num = sc.nextDouble();

            Double squareroot = Math.pow(num, 0.5);
            System.out.println("The Square root of a Given Number  " + num + "  =  " + squareroot);
        }
}

