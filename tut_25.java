import java.util.Scanner;

public class tut_25 {
    public static void main(String[] args) {

        // Problem 1:
        // int n = 4;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        
        // Problem 2:
        // Program to sum first n even number using while loop...
        // int sum = 0;
        // int n = 3;
        // for (int i = 0; i <= n; i++) {
        // sum = sum + (2 * i);
        // }
        // System.out.print("The sum of even number is: ");
        // System.out.println(sum);

        
        // problem 3:
        // Program to print multiplication table of a given number n......
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.print("Enter a number: ");
        // n = sc.nextInt();
        // int result;
        // // int n = 5;
        // for (int i = 1; i <= 10; i++) {
        // // result = i * n;
        // // System.out.println(result);
        // System.out.printf("%d * %d = %d\n", n, i, n * i);
        // }

        
        // Problem 4:
        // Program to find factorial of a given number using for loops.....
        int fac = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        System.out.println(fac);
        
        
        // Problem 5:
        // Repeat 5 using while Loop
        // int i = 1;
        // while (true) {
        // System.out.println("5");
        // i++;
        // }
        
        
        // Problem 6:
        // Repeat 1 using For/ while loop
        // for (int i = 1; 7 > 5; i++) {
        // System.out.println("1");
        // }
        
        
        // Problem 7:
        // Calculate the sum of the numbers occuring in the multiplication table of 8.
        int sum = 0;
        int n = 3; // You can change this number a/c to you
        for (int i = 1; i <= n; i++) {
            sum = sum + (i * 8);
        }
        System.out.println(sum);
        
        
        

    }
}
