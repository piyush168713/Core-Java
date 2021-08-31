
import java.util.Scanner;

public class tut_21 {
    public static void main(String[] args) {
        // int i = 1;
        // int result;
        // while (i <= 5) {
        // result = i * 6;
        // System.out.println(result);
        // // cout<<i<<endl;
        // i++;
        // }

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n, result;
        System.out.print("Enter a no. ");
        n = sc.nextInt();
        while (i <= 10) {
            result = i + n;
            System.out.println(result);
            i++;
        }

        // while (true) {
        // System.out.println("I am an Infinite while Loop");
        // }
        // Infinite loop heats up the computer in almost 1 minute.

    }
}
