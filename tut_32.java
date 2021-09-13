public class tut_32 {

    static void foo() {
        System.out.println("Good morning broo!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " broo!");
    }

    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " broo!");
        System.out.println("Good morning " + b + " broo!");
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void telljoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) {
        // telljoke();
        // int[] marks = { 77, 86, 95, 78, 87, 75 };
        // Case 1: Changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running is: " + x);

        // Case 2: Changing the Array
        // int[] marks = { 77, 86, 95, 78, 87, 75 };
        // change2(marks);
        // System.out.println("The value of marks after running is: " + marks[0]);

        
        
        // METHOD OVERLOADING

        foo();
        foo(5);
        foo(5, 6);
    }
}
