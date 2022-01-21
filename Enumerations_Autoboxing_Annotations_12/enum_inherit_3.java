package Enumerations_Autoboxing_Annotations_12;

// You can't inherit a subclass when declaring an enum, all enumerations automatically inherit one:java.lang.Enum .


// Demostrate ordinal(), compareTo() and equals().

enum MyFriend{
    Piyush, Ashish, Yogesh, Harsh, Vishal;
}

public class enum_inherit_3 {
    public static void main(String[] args) {
        MyFriend f1, f2, f3;

        // obtain all ordinal values using ordinal().
        System.out.println("Here are all friends constants" + " and their ordinal values: ");

        for (MyFriend mf : MyFriend.values())
            System.out.println(mf + " " + mf.ordinal());

        f1 = MyFriend.Piyush;
        f2 = MyFriend.Ashish;
        f3 = MyFriend.Yogesh;

        System.out.println();

        // Demostrate compareTo() and equals()
        if (f1.compareTo(f2) < 0)
            System.out.println(f1 + " comes before " + f2);
        if (f1.compareTo(f2) > 0)
            System.out.println(f1 + " comes before " + f2);
        if (f1.compareTo(f3) == 0)
            System.out.println(f1 + " equals " + f2);

        System.out.println();

        if(f1.equals(f2))
            System.out.println("Error");
        if(f1.equals(f3))
            System.out.println(f1 + " equals " + f3);
        if(f1 == f3)
            System.out.println(f1 + " == " + f3);

    }
}
