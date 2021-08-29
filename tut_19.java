
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
        
        
        // Problem 4:
        // Program to find out the day of week given the number[1 for Monday, 2 for
        // Tuesday....and so on!]
        
        // int day;
        // System.out.print("Enter number: ");
        // day = sc.nextInt();

        // switch (day) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Done with switch case...Thankyou!!");
        // break;
        // }
        
        
        // Problem 5:
        // Program to find whether a year entered by the user is a leap year or not.
        // int year;
        // System.out.print("Enter a year: ");
        // year = sc.nextInt();
        // if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        // System.out.print("leap year");
        // } else {
        // System.out.print("not leap year");
        // }
        
        
        // Problem 6:
        // Program to find out the type of website from url:
        // .com -> commercial website
        // .org -> Organisation website
        // .in -> Indian website
        String url;
        System.out.print("Enter a URL: ");
        url = sc.next();
        if (url.endsWith(".org")) {
            System.out.println("This is an organisation website");
        } else if (url.endsWith(".com")) {
            System.out.println("This is an Commercial website");
        } else if (url.endsWith(".in")) {
            System.out.println("This is an indian website");
        } else {
            System.out.println("This website is not exists!!");
        }
    }
}
