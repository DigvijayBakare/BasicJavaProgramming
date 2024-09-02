package TIllMay2024.String;

/* Java String trim(): The trim() method removes any leading (starting) and trailing (ending) whitespaces from the
   specified string.
   The syntax of the string trim() method is:   string.trim();                                                       */

public class StringTrim {
    public static void main(String[] args) {
        String str1 = "     Learn   Java Programming ";
        String str2 = "Learn\nJava Programming\n\n   ";

        System.out.println(str1.trim());
        System.out.println(str2.trim());
        // It only removes the leading and trailing whitespace. It doesn't remove whitespace that appears in the middle.

        // replace all whitespace characters with empty string
        String str3 = "Learn\nJava \n\n   ";
        String result;
        result = str3.replaceAll("\\s", "");
        System.out.println(result);   // LearnJava
    }
}
