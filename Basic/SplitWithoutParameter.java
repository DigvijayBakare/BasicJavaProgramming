package TIllMay2024.String.SplitMethod;
import java.util.Arrays;

// Splitting a string without passing a limit parameter

public class SplitWithoutParameter {
    public static void main(String[] args) {
        String vowels = "a::e::i::o::u";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
    }

}
