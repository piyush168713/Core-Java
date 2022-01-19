package p2;

class Otherpackage {
    Otherpackage(){
        p1.Protection p = new p1.Protection();     // here it access Protection class from package p1
        System.out.println("Other package constructor p2");

//        class and package access only
//        System.out.println("n = " + p.n);

//        class access only
//        System.out.println("n_pri = " + p.n_pri);

//        class, subclass and package acccess only
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
