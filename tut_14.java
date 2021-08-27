public class tut_14 {
    public static void main(String[] args) {
        String name = "Piyush";
        System.out.println(name);
        // int value = name.length();
        // System.out.println(value);

        String lvalue = name.toLowerCase();
        System.out.println(lvalue);
        // System.out.println(name.toLowerCase());

        String uvalue = name.toUpperCase();
        System.out.println(uvalue);

        String nonTrimmedString = " Piyush ";
        // System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(2, 5));
        System.out.println(name.replace('P', 'T'));
        System.out.println(name.replace("yush", "losty"));
        System.out.println(name.startsWith("Piy"));
        System.out.println(name.endsWith("ush"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ush"));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry", 1));
        System.out.println(modifiedName.indexOf("rry", 3));
        System.out.println(modifiedName.indexOf("rrygdgv", 3));

        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rryrg"));
        System.out.println(modifiedName.lastIndexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(name.equals("Piyush"));
        System.out.println(name.equals("piyush"));
        System.out.println(name.equalsIgnoreCase("piYush"));

        System.out.println("I am Piyush kumar \" double quote");
        System.out.println("I am Piyush kumar \\ back slash");
        System.out.println("I am Piyush kumar \n (new line) monster codes");
        // System.out.println("I am Piyush kumar \t (tab) monster codes");
        // System.out.println("I am Piyush kumar \b (backspace) monster codes");
        // System.out.println("I am Piyush kumar \r (carriage return) monster codes");
        // System.out.println("I am Piyush kumar \f (formfeed in the text) monster
        // codes");

    }
}
