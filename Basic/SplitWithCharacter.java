package TIllMay2024.String.SplitMethod;
import java.util.Arrays;

/*  split() at the + character:
    Note: The split() method takes regex as the first argument. If you need to use special characters such as:
            \, |, ^, *, + etc, you need to escape these characters. For example, we need to use \\+ to split at +.    */

public class SplitWithCharacter {
    public static void main(String[] args) {
        String vowels = "a+e+i+o+u";

        // splitting the string at "+"
        String[] result = vowels.split("\\+");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
    }
}
