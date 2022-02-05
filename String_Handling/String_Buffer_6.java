package String_Handling;

public class String_Buffer_6 {
    public static void main(String[] args) {

        // insert()
        
//        StringBuffer sb = new StringBuffer("I Java!");
//
//        sb.insert(2, "like ");
//        System.out.println(sb);
//


        // reverse()
        
//        StringBuffer s = new StringBuffer("abcdef");
//
//        System.out.println(s);
//        s.reverse();
//        System.out.println(s);



        // delete() and deleteCharAt()

//        StringBuffer sb = new StringBuffer("This is a high trek.");
//
//        System.out.println("Before delete: " + sb);
//        sb.delete(10, 15);
//        System.out.println("After delete: " + sb);
//
//        sb.deleteCharAt(0);
//        System.out.println("After deleteCharAt: " + sb);



        // replace()
        
//        StringBuffer sb = new StringBuffer("This is a high trek.");
//
//        System.out.println("Before replace: " + sb);
//        sb.replace(5,7,"was");
//        System.out.println("After replace: " + sb);



        // substring()
        
        StringBuffer sb = new StringBuffer("one two one");
        int i;

        i = sb.indexOf("one");
        System.out.println("First index: " + i);

        i = sb.lastIndexOf("one");
        System.out.println("Last index: " + i);
        
            
        
    }
}
