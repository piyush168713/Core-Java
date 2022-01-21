package Enumerations_Autoboxing_Annotations_12;

//public class AutoBoxing_5 {
//    public static void main(String[] args) {
//        Integer iOb = 100;     // autobox an int
//
//        int i = iOb;           // auto-unbox
//        System.out.println(i + " " + iOb);
//    }
//}


// Autoboxing is the process by which a primitive type is automatically encapsulated(boxed) into its equivalent type wrapper
// whenever an object of that type is needed. There is no explicitly construct an object.

// Auto-unboxing is the process by which the value of a boxed object is automatically extracted (unboxed) from a type wrapper
// when its value is needed. There is no need to call a method such as intValue() or doubleValue().





//                      AUTOBOXING AND METHODS

//class AutoBoxing_5{
//    // Take an integer parameter and return an int value;
//    static int m(Integer v){
//        return v;
//    }
//
//    public static void main(String[] args) {
//        // Pass an int to m() and assign the return value to the Integer.
//        // Here, the argument 100 is autoboxed into an Integer.
//        // The return value is also autoboxed into an Integer.
//
//        Integer iOb = m(100);
//        System.out.println(iOb);
//    }
//}






//                      AUTOBOXING/UNBOXING OCCURS IN EXPRESSIONS

//  Autoboxing/unboxing occurs inside expressions

//class AutoBoxing_5{
//    public static void main(String[] args) {
//        Integer iOb1, iOb2;
//        int i;
//
//        iOb1 = 100;
//        System.out.println("Original value of iOb1: " + iOb1);
//
//        // The following automatically unboxes iOb1, preforms the increament, and then reboxes the result back into iOb1.
//        ++iOb1;
//        System.out.println("After ++iOb1 " + iOb1);
//
//        // iOb1 is unboxed, the expression is evaluated, and the result is reboxed and assigned to iOb2.
//        iOb2 = iOb1 + (iOb1 / 3);
//        System.out.println("iOb2 after expression: " + iOb2);
//
//        // The same expression is evaluated, but the result is not reboxed.
//        i = iOb1 + (iOb1 / 3);
//        System.out.println("i after expression: " + i);
//    }
//}







//                            AUOBOXING/UNBOXING BOOLEAN AND CHARACTER VALUES

//class AutoBoxing_5{
//    public static void main(String[] args) {
//        Boolean b = true;         // Autobox/unbox a boolean.
//
//        if (b)
//            System.out.println("b is true");
//
//        // Autobox/unbox a char
//        Character ch1 = 'x';      // box a char
//        char ch2 = ch1;        // unbox a char
//
//        System.out.println("ch2 is " + ch2);
//    }
//}





//                             AUOBOXING/UNBOXING HELPS PREVENT ERRORS


// autoboxing/unboxing can also help prevent errors.

class AutoBoxing_5{
    public static void main(String[] args) {
        Integer iOb = 1000;          // autobox the value 1000

        int i = iOb.byteValue();         // manually unbox as byte !!!
        System.out.println(i);        // does not displays 1000 !
    }
}

// autoboxing always creates the proper object, and
// auto-unboxing always produces the proper value.