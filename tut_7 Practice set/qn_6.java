import java.util.Scanner;

//qn ---> 5
//detect whether a number entered by the user is an integer or not
public class qn_6 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(sc.hasNextInt()); // it checks whether it is integer or not
    }
}
