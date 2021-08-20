import java.util.Scanner;

// Qn. ---> 1
// Sum of 3 numbers:

public class qn_1 {

    public static void main(String args[]) {
        int num1, num2, num3, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd no.");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd no.");
        num3 = sc.nextInt();

        total = num1 + num2 + num3;
        System.out.println("sum is: " + total);
    }
}
