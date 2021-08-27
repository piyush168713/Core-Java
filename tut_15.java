public class tut_15 {
    public static void main(String[] args) {

        // Problem 1: Convert a string to lowercase.
        String name = "PIYUSH";
        System.out.println(name.toLowerCase());

        // Problem 2: Replace spaces with underscore
        String word = "Piyush learns basic java programs";
        System.out.println(word.replace(" ", "_"));

        // Problem 3:
        // Program to fill a letter template which looks like below:
        // letter = "Dear <|name|>, Thanks a lot"
        // Replace <|name|> with a string (Someone)
        String letter = "Dear <|name|>, Thanks alot";
        System.out.println(letter.replace("<|name|>", "Piyush"));

        // Problem 4:
        // Program to detect double and triple spaces
        String detect = "This is java  tutorial";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   ")); // This gives -1 because triple space do not exist in it.

        // Problem 5:
        // program to format the folloeing letter using escape sequence characters.
        String kum = "Heyy Viewers,\n\t Me piyush Kumar.\nThanks";
        System.out.println(kum);
    }

}
