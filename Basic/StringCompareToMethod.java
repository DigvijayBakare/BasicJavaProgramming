package TIllMay2024.String;

/* Java TIllMay2024.String compareTo(): The compareTo() method compares two strings lexicographically (in the dictionary order).
        The comparison is based on the Unicode value of each character in the strings.
        The syntax of the compareTo() method is:    string.compareTo(String str)                                     */

public class StringCompareToMethod {
    public static void compareToMethod() {
        String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kotlin";
        int result;

        // comparing str1 with str2
        result = str1.compareTo(str2);
        System.out.println(result);  // 0                               // returns 0 when two strings are equal

        // comparing str1 with str3
        result = str1.compareTo(str3);
        System.out.println(result);  // -1               // returns a negative integer if the string comes before the str argument in the dictionary order

        // comparing str3 with str1
        result = str3.compareTo(str1);
        System.out.println(result);  // 1               // returns a positive integer if the string comes after the str argument in the dictionary order
    }
    public static void usingIfElse() {                  // used compareToMethod() with ifElse condition statements
        String str1 = "Learn Python";
        String str2 = "Learn Java";

        // if str1 and str2 are equal, the result is 0
        if (str1.compareTo(str2) == 0) {
            System.out.println("str1 and str2 are equal");
        }else {
            System.out.println("str1 and str2 are not equal");
        }
        // as java is case-sensitive everytime we compare two strings using any method we'll get false if they are
        // different with only casing, but we can ignore that using particular ignore method(here we can use compareToIgnoreCase() method)
    }
    public static void main(String[] args) {
        compareToMethod();
        usingIfElse();
    }
}
