public class tut_24 {
    public static void main(String[] args) {
        // Break

        // For loop
        // for (int i = 0; i < 40; i++) {
        // System.out.println(i);
        // if (i == 5) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // }

        // while Loop
        // int i = 1;
        // int result;
        // while (i <= 10) {
        // result = i * 7;
        // System.out.println(result);
        // i++;
        // if (i == 6) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // }

        // Do-While Loop
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // if (i == 5) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // } while (i <= 10);

        // Continue

        // For Loop
        // for (int i = 0; i < 40; i++) {
        // if (i == 5) {
        // // System.out.println("Ending the loop");
        // continue;
        // }
        // System.out.println(i);
        // }

        // While Loop
        // int i = 0;
        // int result;
        // while (i <= 10) {
        // i++;
        // if (i == 6) {
        // System.out.println("Ending the loop");
        // continue;
        // }
        // result = i * 7;
        // System.out.println(result);
        // }

        // Do-While Loop
        int i = 0;
        do {
            i++;
            if (i == 5) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
        } while (i <= 10);
    }
}
