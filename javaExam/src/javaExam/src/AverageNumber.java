//question 1(ii)
import java.util.Scanner;
public class AverageNumber {
    public static void  main (String[] args) {

        int a, b, c, d, e, sum1;
//        asking for user input

        Scanner myNum = new Scanner(System.in);
        System.out.println("Type the first number: ");
        a = myNum.nextInt();
        System.out.println("Type the second number: ");
        b = myNum.nextInt();
        System.out.println("Type the third number: ");
        c = myNum.nextInt();
        System.out.println("Type the forth number: ");
        d = myNum.nextInt();
        System.out.println("Type the fifth number: ");
        e = myNum.nextInt();

//        getting the sum
        sum1 = a + b + c + d + e;
        System.out.println("Sum of numbers is " + sum1);
//        inserting the values into an array
        int[] arr1 = {a, b, c, d, e};

//         getting the length
        int arrayLength = arr1.length;
//        average
        double average = ((double) sum1 / (double) arrayLength);
        System.out.println("Length is " + arrayLength);
        System.out.println("Average is " + average);

    }
}