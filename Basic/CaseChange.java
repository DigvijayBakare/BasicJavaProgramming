package TIllMay2024.String;

// Changing the case of a given string

import java.util.Locale;

public class CaseChange {
    public static void lowerCase(){                             // method to change string's content to lower case
        String str = "THIS IS A JAVA LANGUAGE";
        System.out.println("TIllMay2024.String before transformation: "+str);
        // using toLowerCase() method we can convert above string to lower case
        System.out.println("Lower case string: "+str.toLowerCase());
    }
    public static void upperCase(){                             // method to change string's content to upper case
        String str = "this is a java language";
        System.out.println("TIllMay2024.String before transformation: "+str);
        // using toUpperCase() method we can convert above string to upper case
        System.out.println("Upper case string: "+str.toUpperCase());
    }

    public static void main(String[] args) {
//        lowerCase();
        upperCase();
    }
}
