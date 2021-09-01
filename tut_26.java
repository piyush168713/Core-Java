public class tut_26 {
    public static void main(String[] args) {
        // There are 3 main to create an array in java

        // 1. Declaration + memory allocation
        // int[] marks = new int[5];

        // 2. Declare + Initialise
        // int[] marks = { 83, 67, 67, 95, 76 };

        // 3. Declaration then memory allocation
        int[] marks;
        marks = new int[5];

        marks[0] = 83;
        marks[1] = 67;
        marks[2] = 67;
        marks[3] = 95;
        marks[4] = 76;
        System.out.println(marks[4]);
    }
}
