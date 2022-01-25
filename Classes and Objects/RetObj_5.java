package com.company;

class Test{
    int a;

    Test(int i){
        a=i;
    }

    Test incrbyTen(){
        Test temp = new Test(a+10);
        return temp;
    }
}

public class RetObj_5 {
    public static void main(String[] args) {
        Test obj1 = new Test(2);
        Test obj2;

        obj2 = obj1.incrbyTen();
        System.out.println("obj1.a: " + obj1.a);
        System.out.println("obj2.a: " + obj2.a);
    }
}
