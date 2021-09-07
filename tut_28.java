public class tut_28 {
    public static void main(String[] args) {
        // int[] marks; // 1-D Array
        int[][] flats; // 2-D Array
        flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 103;
        flats[1][1] = 104;
        flats[1][2] = 105;
        // System.out.println(flats.length);
        // System.out.println(flats[1].length);

        // Displaying the 2-D Array (for - loop)
        System.out.println(" Printing a 2-D Array using for Loop: ");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}