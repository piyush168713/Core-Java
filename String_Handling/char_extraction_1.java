package String_Handling;

public class char_extraction_1 {
    public static void main(String[] args) {


//        char ch;
//        ch = "piyush".charAt(0);
//        System.out.println(ch);

//        String s = "This is a demo of the getChars method";
        String s = "Garhwal and kumaon is situated in Uk";
        int start = 0;
        int end = 7;
        char buf[] = new char[end - start];

        s.getChars(start,end,buf,0);
        System.out.println(buf);


        // getBytes() is an alternative to getChars() that stores the characters in an array of bytes.
        // byte[] getBytes()

        // toCharArray() converts all the characters in a string object into a character array.
        // char[] toCharArray()

    }
}