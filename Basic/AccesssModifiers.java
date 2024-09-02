package TIllMay2024.AccessModifier;


public class AccesssModifiers{
    private static class A{
        void sddf(){
            System.out.println("This is Private Class");
        }
    }
    protected static class B{
        void gj(){
            System.out.println("This is Protected Class");
        }
    }
    static {
        System.out.println("Static block");
    }
    private void privateMethod(){
        System.out.println("This is Private Method");
    }
    protected void protectedMethod(){
        System.out.println("This is Protected Method");
    }
    void defaultMethod(){
        System.out.println("This is Default Method");
    }
    public void publicMethod(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args){
        AccesssModifiers accesssModifiers = new AccesssModifiers();
        A a =new A();
        a.sddf();
        accesssModifiers.privateMethod();
        accesssModifiers.protectedMethod();
        accesssModifiers.defaultMethod();
        accesssModifiers.publicMethod();
    }
}

