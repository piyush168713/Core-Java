import java.util.Scanner;

// qn ---> 4
// convert Kilometers to miles.
public class qn_4 {
    public static void main(String[] args) {
        double kilometer, mile;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kilometer: ");
        kilometer = sc.nextDouble();

        mile = (kilometer * 0.621);
        System.out.println("Mile: " + mile);

    }
}
