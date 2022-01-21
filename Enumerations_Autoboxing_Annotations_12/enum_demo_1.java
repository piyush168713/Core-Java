package Enumerations_Autoboxing_Annotations_12;

//enum Friends{
//    Piyush, Yogesh, Ashish, Harsh, Vishal
//}
//
//public class enum_demo_1 {
//    public static void main(String[] args) {
//        Friends ap;
//        ap = Friends.Ashish;
//
//        System.out.println("Value of ap: " + ap);
//        System.out.println();
//
//        ap = Friends.Yogesh;
//
//        // compares two enum values
//        if (ap == Friends.Yogesh)
//            System.out.println("ap contains Yogesh.\n");
//
//        // Use an enum to control a switch statement
//        switch (ap) {
//            case Piyush:
//                System.out.println("Piyush is Red.");
//            break;
//            case Yogesh:
//                System.out.println("Yogesh is yellow.");
//            break;
//            case Ashish:
//                System.out.println("Ashish is pink");
//            break;
//            case Harsh:
//                System.out.println("Harsh is blue");
//            break;
//            case Vishal:
//                System.out.println("Vishal is orange");
//            break;
//        }
//    }
//}





//                          USE OF values() AND valueOf() METHODS

enum Friends{
    Piyush, Yogesh, Ashish, Harsh, Vishal
}

class enum_demo_1{
    public static void main(String[] args) {
        Friends fr;
        System.out.println("here are all friends constants:");

        // use values()
        Friends allfr[] = Friends.values();
        for (Friends a : allfr)
            System.out.println(a);

        System.out.println();

        // use valueOf()
        fr = Friends.valueOf("Ashish");
        System.out.println("fr contains: " + fr);
    }
}