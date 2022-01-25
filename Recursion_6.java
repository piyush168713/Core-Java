package com.company;//class Factorial{
//    int fact(int n){
//        int result;
//
//        if (n==1) return  1;
//        result = fact(n-1) * n;
//        return result;
//    }
//}
//
//public class com.company.Recursion_6 {
//    public static void main(String[] args) {
//        Factorial f = new Factorial();
//
//        System.out.println("Factorial of 3 is: " + f.fact(3));
//        System.out.println("Factorial of 4 is: " + f.fact(4));
//        System.out.println("Factorial of 5 is: " + f.fact(5));
//    }
//}





class RectTest{
    int values[];

    RectTest(int i){
        values = new int[i];
    }

    // display array -- recursively
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}

class Recursion_6{
    public static void main(String[] args) {
        RectTest obj = new RectTest(10);
        int i;
        for (i = 0; i<10; i++)
            obj.values[i] = i;
        obj.printArray(10);
    }
}


