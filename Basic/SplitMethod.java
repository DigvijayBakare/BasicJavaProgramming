package TIllMay2024.String.SplitMethod;

// The split() method divides the string at the specified regex and returns an array of substrings.
/* Syntax of TIllMay2024.String split():
        str.split(TIllMay2024.String regex, int limit)
   Here, string is an object of the TIllMay2024.String class.
-- split() Parameters: The string split() method can take two parameters:
        1.regex - the string is divided at this regex (can be strings)
        2.limit (optional) - controls the number of resulting substrings
    If the limit parameter is not passed, split() returns all possible substrings.
-- split() Return Value: returns an array of substrings
Note: If the regular expression passed to split() is invalid, the split() method raises PatternSyntaxExpression exception.*/

import TIllMay2024.Basics.Arrays;

public class SplitMethod {
    public static void ch(){                                    // tried splitting the string with a specific character
        String text = "Java is a fun programming language";
        //splitting string from string
        String[] result = text.split("a");
        System.out.println("\nResult: ");
        for (String str : result) {
            System.out.print(str + ", ");
        }
    }
    public static void main(String[] args){
        String text = "Java is a fun programming language";
        System.out.println("Original text: "+ text);
        //splitting string from string
        String[] result = text.split(" ");
        System.out.print("Result: ");
        /*for (String str : result){
            System.out.print(str+" ");
        }*/

        // for printing only even length strings in the result array
        for (String str : result){
            if ((str.length())%2 == 0){
                System.out.print(str+" ");
            }
        }


//        ch();
    }
}
