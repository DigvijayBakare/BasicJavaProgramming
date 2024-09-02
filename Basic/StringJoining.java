package TIllMay2024.String;
import java.util.ArrayList;

/* Java TIllMay2024.String join(): The join() method returns a new string with the given elements joined with the specified delimiter.
   - Syntax of join(): The syntax of the string join() method is either:
    1. TIllMay2024.String.join(CharSequence delimiter, Iterable elements)
    2. TIllMay2024.String.join(CharSequence delimiter, CharSequence... elements)
        Here, ... signifies there can be one or more CharSequence.
    * delimiter - the delimiter to be joined with the elements. It can be anything like space or dash etc.
    * elements - elements to be joined, this can be two or more.
Note: join() is a static method. You do not need to create a string object to call this method. Rather, we call the
        method using the class name TIllMay2024.String.                                                                           */

public class StringJoining {
    public static void withCharSequence() {                                       // using string/char sequence for joining
        String result;                                                            // joining using dash
        result = String.join("-", "Java", "is", "fun");
        System.out.println(result);  // the output will be Java-is-fun

        String result1;                                                            // joining using space
        result1 = String.join(" ", "Java", "is", "fun");
        System.out.println(result1);  // the output will be Java-is-fun
    }
    public static void withIterables() {                                       // using iterables for joining
        // it is an array list
        ArrayList<String> text = new ArrayList<>();

        // adding elements to the arraylist
        text.add("Java");
        text.add("is");
        text.add("fun");

        String result;                                                            // joining using dash
        result = String.join("-", text);
        System.out.println(result);  // the output will be Java-is-fun

        String result1;                                                            // joining using space
        result1 = String.join(" ", text);
        System.out.println(result1);  // the output will be Java-is-fun
    }
    public static void main(String[] args) {
//        withCharSequence();
        withIterables();
    }
}
