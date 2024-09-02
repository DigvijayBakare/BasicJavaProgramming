package TIllMay2024.String;

/* Java String intern(): returns a canonical representation of the string
   The syntax of the string intern() method is: string.intern()
    What is Java String Interning?
 => The String interning ensures that all strings having the same contents use the same memory.
    Suppose, we have these two strings:
            String str1 = "xyz";
            String str2 = "xyz";
Since both str1 and str2 have the same contents, both these strings will share the same memory. Java automatically
interns the string literals. However, if you create strings with using the new keyword, these strings won't share the same memory.     */

public class StringInterning {
    public static void main(String[] args) {

        String str1 = new String("xyz");
        String str2 = new String("xyz");

        // str1 and str2 doesn't share the same memory pool
        System.out.println(str1 == str2); // false

        // using the intern() method
        // now both str1 and str2 share the same memory pool
        str1 = str1.intern();
        str2 = str2.intern();
        System.out.println(str1 == str2); // true
    }
}
