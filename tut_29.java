public class tut_29 {
    public static void main(String[] args) {

        // Problem 1:
        // Create an array of 5 floats and calculate their sum.
        // double[] marks = { 83.5, 67.5, 67.5, 95.5, 76.5 };
        // double sum = 0;
        // for (double elements : marks) {
        // sum = sum + elements;
        // }
        // System.out.println("The sum is: " + sum);

        // Problem 2:
        // Write a program to find out whether a given integer is present in an array or
        // not.
        // float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        // float num = 45.7f;
        // boolean isinarray = false;
        // for (float elements : marks) {
        // if (num == elements) {
        // isinarray = true;
        // break;
        // }
        // }
        // if (isinarray) {
        // System.out.println("The value is present in the Array");
        // } else {
        // System.out.println("The value is not present in the Array");
        // }

        // Problem 3:
        // Calculate the average marks from an array containing marks of all students in
        // physics using a for-each loop.
        // float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        // float sum = 0;
        // for (float element : marks) {
        // sum = sum + element;
        // }
        // System.out.println("The value of average marks is " + sum / marks.length);

        // Problem 4:
        // Create a Java program to add two matrices of size 2x3
        // int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] mat2 = { { 2, 6, 13 }, { 3, 7, 1 } };
        // int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };

        // for (int i = 0; i < mat1.length; i++) { // row number of times
        // for (int j = 0; j < mat1[i].length; j++) { // column number of time
        // System.out.format(" Setting value for i=%d and j=%d\n", i, j);
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // }

        // // Printing the elements of a 2-D Array
        // for (int i = 0; i < mat1.length; i++) { // row number of times
        // for (int j = 0; j < mat1[i].length; j++) { // column number of time
        // System.out.print(result[i][j] + " ");
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // System.out.println(""); // Prints a new line
        // }

        // Problem 5:
        // Write a Java program to reverse an array.
        // int[] arr = { 1, 21, 3, 4, 5, 34, 67 };
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;

        // for (int i = 0; i < n; i++) {
        // // Swap a[i] and a[l-1-i]
        // // a b temp
        // // |4| |3| ||
        // temp = arr[i];
        // arr[i] = arr[l - i - 1];
        // arr[l - i - 1] = temp;
        // }

        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        // Problem 6:
        // Write a Java program to find the maximum element in an array.
        // int[] arr = { 1, 2100, 3, 455, 5, 34, 67 };
        // int max = Integer.MIN_VALUE;
        // for (int e : arr) {
        // if (e > max) {
        // max = e;
        // }
        // }
        // System.out.println("the value of the maximum element in this array is: " +
        // max);
        // int[] arr = { 1, 2100, 3, 455, 5, 34, 67 };

        // Problem 7:
        // Write a Java program to find the minimum element in an array.
        // int[] arr = { 1, 2100, 3, 455, 5, 34, 67 };
        // int min = Integer.MAX_VALUE;
        // for (int e : arr) {
        // if (e < min) {
        // min = e;
        // }
        // }
        // System.out.println("the value of the minimum element in this array is: " +
        // min);

        // Problem 8:
        // Write a Java program to find whether an array is sorted or not.
        boolean isSorted = true;
        int[] arr = { 1, 12, 3, 4, 5, 34, 67 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }
    }
}
