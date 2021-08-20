import java.util.Scanner;

// Qn. ---> 2
// Calculate cgpa using marks of 5 sujects(out of 100)

public class qn_2 {
    public static void main(String args[]) {
        int phy, che, math, eng, comp, total;
        double cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Physics: ");
        phy = sc.nextInt();
        System.out.print("Enter marks of Chemistry: ");
        che = sc.nextInt();
        System.out.print("Enter marks of Maths: ");
        math = sc.nextInt();
        System.out.print("Enter marks of English: ");
        eng = sc.nextInt();
        System.out.print("Enter marks of Computer: ");
        comp = sc.nextInt();

        total = phy + che + math + eng + comp;
        cgpa = (total * 2 / 100.0);

        System.out.println("Total marks: " + total);
        System.out.println("cgpa: " + cgpa);
    }
}
