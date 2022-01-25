package com.company;
// when a method in a subclass has the same name and type signature as a method in its superclass,
// then the method in the subclass is said to override the method in the superclass.
// ex- void show(){ } ,    show() is method.


class A{
    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }

    // display i and j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A{
    int k;

    B(int a, int b, int c){
        super(a,b);
        k=c;
    }

    // display k - this overrides show() in com.company.A
    void show(){
//        super.show();          // this calls com.company.A's show()
        System.out.println("k: " + k);
    }
}

class Mtd_Overriding_11 {
    public static void main(String[] args) {
//        com.company.B b = new com.company.B(1,2,3);
//        b.show();       // this calls show() in com.company.B




        // Dynamic Method Dispatch for calling
        A a = new A(1,2);     // object of type com.company.A
        B b = new B(4,5,6);      // object of type com.company.B

        A r;     // obtain a reference of type com.company.A

        r = a;     // r refers to an com.company.A object
        r.show();    // calls com.company.A's version of show()

        r = b;      // r refers to an com.company.B object
        r.show();    // calls com.company.B's version of show()
    }
}
