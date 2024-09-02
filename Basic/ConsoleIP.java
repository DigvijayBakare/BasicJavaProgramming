package TIllMay2024.Basics;

import java.io.Console;

public class ConsoleIP {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            String name = console.readLine("Enter your name: ");
            char[] password = console.readPassword("Enter your password: ");

            System.out.println("Hello, " + name + "! Your password is: " + new String(password));
        } else {
            System.out.println("Console is not available.");
        }
    }
}
