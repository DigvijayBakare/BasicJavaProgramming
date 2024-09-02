package TIllMay2024.String;

// Concatenation of string = that is adding two strings

public class StringConcatenating {
    public static void main(String[] args) {
        String str1 = "Java";                               // strings declared using string literals
        String str2 = " Programming";

        // concatenating using concat method
        String str = str1.concat(str2);
        System.out.println("After concatenating string(using concat method) = "+str);

        // concatenating using + operator
        String strC = str1+str2;
        System.out.println("After concatenating string(using + operator) = "+strC);
    }
}
