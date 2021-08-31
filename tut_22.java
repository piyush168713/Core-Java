import java.util.Scanner;

public class tut_22 {
    public static void main(String[] args) {
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n, result;
        System.out.print("Enter a no. : ");
        n = sc.nextInt();
        do {
            result = i * n;
            System.out.println(result);
            i++;
        } while (i <= 10);

        // int i = 1;
        // do {
        // System.out.println(i);
        // i++;
        // // } while (i<=40);
        // } while (true);
        // .. Infinite Do-While loop
    }
}
