public class tut_9 {
    public static void main(String[] args) {
        // Precedence & Associativity

        // int a = 6 * 5 - 34 / 2;
        // // Highest precedence goes to * / . They are then evaluated on the basis of
        // left
        // // to right as associativity.
        // int b = 60 / 5 - 34 * 2;
        // System.out.println(a);
        // System.out.println(b);

        // Quick Quiz
        int a = 4;
        int b = 8;
        int c = 2;
        // int k = x * y / 2;
        int k = ((b * b) - (4 * a * c)) / (2 * a);
        System.out.println(k);

    }
}
