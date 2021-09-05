public class tut_27 {
    public static void main(String[] args) {
        int[] marks = { 83, 67, 67, 95, 76 };
        // System.out.println(marks.length);
        // System.out.println(marks[2]);

        
        // Displaying the Array (for - loop)
        // System.out.println(" Printing using for Loop: ");
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

        
        // Displaying the Array (for - loop)
        // System.out.println(" Printing using for Loop in reverse order: ");
        // for (int i = marks.length - 1; i >= 0; i--) {
        // System.out.println(marks[i]);
        // }

        
        // Displaying the Array (for-each loop)
        System.out.println(" Printing using for-each Loop: ");
        for (int elements : marks) {
            System.out.println(elements);
        }

    }
}
