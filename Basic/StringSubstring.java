package TIllMay2024.String;

/* Java String substring(): The Java substring() method extracts a part of the string (substring) and returns it.
   substring() Syntax:  string.substring(int startIndex, int endIndex)                                              */

public class StringSubstring {
    public static void onlyStartIndex(){
        String str = "Java Programming";
        System.out.println("With only starting index: "+str.substring(0));      // all statement
        // second word only
        System.out.println("Second word: "+str.substring(5));                   // got only second word
    }
    public static void withStartAndEndIndex(){
        String str = "Java Programming language";
        System.out.println("Before applying method of start and end index:\n "+str);
        System.out.println("After applying method of start and end index:\n "+str.substring(5,16));     // added both start and end index to get a specific word
    }
    public static void main(String[] args){
//        onlyStartIndex();
        withStartAndEndIndex();
    }
}
