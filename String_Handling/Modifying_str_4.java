package String_Handling;

//public class Modifying_str_4 {
//}


//            substring() Method
//class StringReplace{
//    public static void main(String[] args) {
//        String org = "This is a test. This is, too.";
//        String search = "is";
//        String sub = "was";
//        String result = " ";
//        int i;
//
//        do {  // replace all matching substrings
//            System.out.println(org);
//            i = org.indexOf(search);
//            if (i != -1) {
//                result = org.substring(0, i);
//                result = result + sub;
//                result = result + org.substring(i + search.length());
//                org = result;
//            }
//        } while (i != -1);
//    }
//}



//                concat()  Method

//class StringConcat {
//    public static void main(String[] args) {
//        String s1 = "one";
//        String s2 = s1.concat("two");
//        System.out.println(s2);
//    }
//}



//         replace() Method

//class StringReplace {
//    public static void main(String[] args) {
//        String s = "Hello".replace('l', 'p');
//        System.out.println(s);
//    }
//}



//         trim() and strip() Method


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

class StringTrim {
    public static void main(String[] args)
    throws IOException
    {
//        String s = "   Hello World   ".trim();
//        System.out.println(s);

        // create a BufferReader using System.in
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter state: ");
        do{
            str = br.readLine();
            str = str.trim();   // remove whitespace
            if(str.equals("Punjab"))
                System.out.println("Capital is Chandigarh.");
            else if (str.equals("Uttarakhand"))
                System.out.println("Capital is Dehradun.");
            else if(str.equals("Haryana"))
                System.out.println("Capital is Chandigarh.");
            else if(str.equals("Chandigarh"))
                System.out.println("Capital is Chandigarh.");
        } while (!str.equals("stop"));
    }
}
