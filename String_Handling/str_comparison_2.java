package String_Handling;

//public class str_comparison_2 {
//    public static void main(String[] args) {
//
////     equals() and equalsIgnoreCase()
//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = "Good-bye";
//        String s4 = "Hello";
//
//        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
//        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
//        System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
//        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));
//    }
//}



    // regionMatches() method compares a specific region inside a string with another specific region in another string.
    // boolean regionMatches(int startIndex, String str2, int str2StartIndex, int numChars)
    // boolean regionMatches(boolean ignoreCase,int startIndex, String str2, int str2StartIndex, int numChars)



    // startsWith() and endsWith()


    // equals()Versus ==
//    public class str_comparison_2 {
//        public static void main(String[] args) {
//            String s1 = "Hello";
//            String s2 = new String(s1);
//
//            System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
//            System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
//        }
//    }



    // compareTo()
    // A Bubble sort for strings.

    class SortString{
        static String arr[] = {
                "Now", "is", "the", "time", "for", "all", "good", "men",
                "to", "come", "to", "the", "aid", "of", "the", "country"
        };

        public static void main(String[] args) {
            for (int j = 0; j < arr.length; j++){
                for (int i = j+1; i < arr.length; i++){
                    if (arr[i].compareTo(arr[j]) < 0){
                        String t = arr[j];
                        arr[j] = arr[i];
                        arr[i] = t;
                    }
                }
                System.out.println(arr[j]);
            }
        }
    }
