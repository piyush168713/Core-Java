import java.util.Scanner;

public class tut_23 {
    public static void main(String[] args) {

        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);

        int n, result;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            result = i * n;
            System.out.println(result);
        }

        // Odd Numbers
        // int result;
        // for (int i = 1; i <= 10; i++) {
        // result = (2 * i) + 1;
        // System.out.println(result);
        // }

        // for (int i = 5; i >= 0; i--) {
        // System.out.println(i);
        // }
    }
}
