
// Practice set:
import java.util.Scanner;

public class tut_19 {
    public static void main(String[] args) {

        // Problem 1:
        // int a = 10;
        // if (a == 11) {
        // System.out.println("I am 11");
        // } else {
        // System.out.println("I am not 11");
        // }

        // Problem 2:
        // Program to find out whether a student is pass or fail; if it requires total
        // 40% and atleast 33% in each subject to pass. Assume 3 subjects and take marks
        // as an input from the user.
        Scanner sc = new Scanner(System.in);
        // int math, phy, che, marks;
        // System.out.print("Enter math marks: ");
        // math = sc.nextInt();
        // System.out.print("Enter phy marks: ");
        // phy = sc.nextInt();
        // System.out.print("Enter che marks: ");
        // che = sc.nextInt();
        // marks = ((math + phy + che) / 3);
        // System.out.println("Total marks: " + marks + "%");
        // if (marks >= 40 && math >= 33 && phy >= 33 && che >= 33) {
        // System.out.println("very Good!!....You are passed");
        // } else {
        // System.out.println("Fail");
        // }

        // Problem 3:
        // Income tax paid by an employee:
        // Income Slab Tax
        // 2.5L - 5.0L 5%
        // 5.0L - 10.0L 20%
        // Above 10.0L 30%
        // Take input from user side
        float income;
        System.out.print("Enter your income in Lakhs: ");
        income = sc.nextFloat();
        if (income >= 1.0 && income < 2.5) {
            System.out.println("You don't have to pay tax");
        } else if (income >= 2.5 && income <= 5.0) {
            System.out.println("You have to pay 5% tax");
        } else if (income > 5.0 && income <= 10.0) {
            System.out.println("You have to pay 20% tax");
        } else if (income > 10.0) {
            System.out.println("You have to pay 30% tax");
        }
    }
}
