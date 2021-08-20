import java.util.Scanner;

// Qn ---> 3
// asks the user to enter his/her name and greets them
public class qn_3 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        name = sc.nextLine();
        System.out.println("Hello " + name + " Have a good day :-)");

    }
}
