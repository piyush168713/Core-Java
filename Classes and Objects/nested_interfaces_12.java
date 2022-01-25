package com.company;

class A11{
    public interface NestedIF{
    boolean isnotnegative(int x);
    }
}

class B11 implements A11.NestedIF {
    public boolean isnotnegative(int x){
        return x<0 ? false: true;
    }
}

public class nested_interfaces_12 {
    public static void main(String[] args) {

        A11.NestedIF nif = new B11();
        if(nif.isnotnegative(10))
            System.out.println("10 is not negative");
        if (nif.isnotnegative(-12))
            System.out.println("this won't be displayed");
    }
}
