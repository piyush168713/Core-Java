package com.company;

class test{
    int a;      // Default access
    public int b;    // Public access
    private int c;    // Private access

    void setc(int i){        // method to access c
        c=i;
    }

    int getc(){
        return c;          // get c's value
    }
}

public class Access_Control_7 {
    public static void main(String[] args) {
        test obj = new test();
        obj.a = 10;
        obj.b = 20;

        // obj.c = 30      // Error   // can't directly access private member

        // you may access private member c through its method
        obj.setc(100);
        System.out.println("a, b and c: " + obj.a + " " + obj.b + " " + obj.getc());
    }
}
