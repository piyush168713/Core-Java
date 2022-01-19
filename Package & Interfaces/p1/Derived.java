package p1;

class Derived extends Protection{
    Derived(){
        System.out.println("Derived Constructor p1");
        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);       // class only    // Not accessible
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
