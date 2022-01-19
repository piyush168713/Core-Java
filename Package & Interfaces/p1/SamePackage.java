package p1;

class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same Package Constructor p1");
        System.out.println("n = " + p.n);
//        System.out.println("n.pri = " + p.n_pri);     // Not accessible   // private
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
