import java.util.Scanner;

public class tut_18 {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter you age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult!!!");
                break;
            case 23:
                System.out.println("You are going to join a job!!!);
                break;
            case 60:
                System.out.println("You are going to get retired!!!");
                break;
            default:
                System.out.println("Enjoy your life!!!");
                break;
        }
        System.out.println("Thanks you :-)");

        // if (age > 56) {
        // System.out.print("You are experienced");
        // }
        // else if (age > 46) {
        // System.out.print("You are semi-experienced");
        // }
        // else if (age > 36) {
        // System.out.print("You are semi-semi-experienced");
        // }
        // else {
        // System.out.print("You are not experienced");
        // }
                                                            
    }
}
