package p2;

public class Protection2 extends p1.Protection{
    Protection2(){
        System.out.println("derived other package constructor p2");

//        class or package access only
//        System.out.println("n = " + n);

//        class access only
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
