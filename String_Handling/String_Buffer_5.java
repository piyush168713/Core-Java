package String_Handling;

public class String_Buffer_5 {
    public static void main(String[] args) {

        // length() and capacity()
//        StringBuffer sb = new StringBuffer("Hello");    // StringBuffer is a Constructor
//        System.out.println("buffer = " + sb);
//        System.out.println("buffer = " + sb.length());
//        System.out.println("buffer = " + sb.capacity());



        //  ensureCapacity()
        // If you want to preallocate room for a certain number of characters after a StringBuffer has been constructed,
        // you can use ensureCapacity() to set the size of the buffer.
        // StringBuffer.ensureCapacity()
        // void ensureCapacity(int minCapacity)


        // setLength()
        // void setLength(int len)


        // charAt() and setCharAt()
//        StringBuffer sb = new StringBuffer("Hello");
//        System.out.println("Buffer before = " + sb);
//        System.out.println("charAt(1) before = " + sb.charAt(1));
//
//        sb.setCharAt(1,'i');
//        sb.setLength(2);
//        System.out.println("buffer after = " + sb);
//        System.out.println("charAt(1) after = " + sb.charAt(1));


        // getChars()
        // void getChars(int sourceStart, int sourceEnd, char target[], int targetStart)


        // append()
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);

        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
