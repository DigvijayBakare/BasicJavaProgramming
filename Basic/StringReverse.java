package TIllMay2024.String;

public class StringReverse {
    public static void stringChar() {
        String str = "Java lang";

        //Printing each character in a given string
        for (int i=0; i<str.length(); i++){
            System.out.println("Character at index "+i+" is "+str.charAt(i));
        }
        System.out.println();
    }
    public static void stringPrinting() {
        String str = "Java lang";

        //Printing given string as it is
        System.out.println("Given string is: ");
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void stringReverse() {
        String str = "Java lang";

        //Printing given string in reverse order
        System.out.println("String after reversing: ");
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stringChar();
        stringPrinting();
        stringReverse();
    }
}
