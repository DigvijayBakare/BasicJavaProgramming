package TIllMay2024.String.ValueOfMethod;

/*  Convert sub-array of the char Array to String: You can also convert a sub-array of a character array to string.
    For this, we use this syntax:
        valueOf(char[] data, int offset, int length)
where, data - the character array
       offset - initial offset of the sub-array
       count - the length of the sub-array                                                                          */

public class SubArray_of_a_char_Array_to_String {
    public static void main(String[] args) {
        char ch[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int offset = 2;
        int length = 4;
        String result;

        // sub-array {'o', 'g', 'r', 'a'} is converted to string
        result = String.valueOf(ch, offset, length);
        System.out.println(result);  // "ogra"
    }
}
