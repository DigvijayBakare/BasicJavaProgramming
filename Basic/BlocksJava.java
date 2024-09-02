package TIllMay2024.BlocksInJava;

class JavaBlock {
    JavaBlock() {
        System.out.println("This is a constructor");                    // 3
    }

    {
        System.out.println("This is block method");                     // 2     Prints always after static block
    }
}

public class BlocksJava extends JavaBlock {
    static {
        System.out.println("This is TIllMay2024.Static block method");              // 1
    }

    void blockJava() {
        System.out.println("This is void method in main class");       // 4
    }

    {
        System.out.println("Hello");
    }

    BlocksJava() {                                                     // During execution, it always executes all the blocks in parent class
        System.out.println("Constructor in main method");
    }

    public static void main(String[] args) {
        BlocksJava bj = new BlocksJava();
        bj.blockJava();
    }
}
