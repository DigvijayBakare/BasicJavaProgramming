package TIllMay2024.String;

/*  Java String format(): The format() method returns a formatted string based on the argument passed.
    The syntax of the String format() method is:
        String.format(String str, Object... args)
    Here,   format() is a static method. We call the format() method using the class name String.
            str is a string that is to be formatted
            ... in the above code signifies you can pass more than one object to format().                          */

import java.util.Locale;
import java.util.Scanner;

public class StringFormat {
    public static void formatting() {
        String language = "Java";
        int number = 30;
        String result;

        // format object as a string
        result = String.format("Language: %s", language);
        System.out.println(result);                             // Language: Java

        // format number as a hexadecimal number
        result = String.format("Hexadecimal Number: %x", number);
        System.out.println(result);                             // Hexadecimal Number: 1e
    }
    public static void numberFormatting() {
        int n1 = 47;
        float n2 = 35.864f;
        double n3 = 44534345.76d;

        // format as an octal number
        System.out.println(String.format("n1 in octal: %o", n1));  // 57

        // format as hexadecimal numbers
        System.out.println(String.format("n1 in hexadecimal: %x", n1));  // 2f
        System.out.println(String.format("n1 in hexadecimal: %X", n1));  // 2F

        // format as strings
        System.out.println(String.format("n1 as string: %s", n1));  // 47
        System.out.println(String.format("n2 as string: %s", n2));  // 35.864

        // format in scientific notation
        System.out.println(String.format("n3 in scientific notation: %g", n3)); // 4.45343e+07
    }
    public static void multipleFormatSpecifier() {
        int n1 = 47;
        String text = "Result";

        System.out.println(String.format("%s\nhexadecimal: %x", text, n1));
    }

    public static void decimalNumberFormat() {
        float n1 = -452.345f;
        double n2 = -345.556d;

        // format floating-point as it is
        System.out.println(String.format("n1 = %f", n1));       // -452.345001
        System.out.println(String.format("n2 = %f", n2));       // -345.556000

        // show up to two decimal places
        System.out.println(String.format("n1 = %.2f", n1));       // -452.35
        System.out.println(String.format("n2 = %.2f", n2));       // -345.56
    }

    public static void padding() {          // simply means adding either space or zero's in left side of number to make it of a required size
        int n1 = 46, n2 = -46;              // Here we are making it 5 digits long
        String result;

        // padding number with spaces, the length of the string will be 5
        result = String.format("|%5d|", n1); // |   46|
        System.out.println(result);

        // padding number with numbers 0, the length of the string will be 5
        result = String.format("|%05d|", n1); // |00046|
        System.out.println(result);

        // using signs before numbers
        result = String.format("%+d", n1); // +46
        System.out.println(result);
        result = String.format("%+d", n2); // -46
        System.out.println(result);

        // enclose negative number within parenthesis
        // and removing the sign
        result = String.format("%(d", n2); // (46)

        System.out.println(result);
    }
    public static void zeroXAndZero() {
        int n = 46;
        System.out.println(String.format("%#o",n));
        System.out.println(String.format("%#x",n));
    }
    public static void germanLocale() {
        int n = 456123456;

        // using current locale
        System.out.println(String.format("Number: %d", n));

        // using the GERMAN Locale as the first argument
        System.out.println(String.format(Locale.GERMAN,"Number in GERMAN: %,d",n));
    }
    public static void newMethod() {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
    }
    public static void newMethod1() {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
            for (int j=0; j<n; j++) {
                s += (Math.pow(2,j)*b);
                System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
    public static void main(String[] args){
//        formatting();
//        numberFormatting();
//        multipleFormatSpecifier();
//        decimalNumberFormat();
//        padding();
//        zeroXAndZero();
//        germanLocale();
//        newMethod();
        newMethod1();
    }
}
