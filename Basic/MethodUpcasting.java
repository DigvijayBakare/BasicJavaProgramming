package TIllMay2024.Polymorphism.MethodOverriding.Casting;
/* Upcasting will be used in methods for checking the output    */

class Methods{
    void m1(){
        System.out.println("M1 method in parent class");
    }
    void m2(){
        System.out.println("M2 method");
    }
}
class ChildMethod extends Methods{
    void m3(){
        System.out.println("M3 method");
    }
    @Override
    void m2() {
        System.out.println("Overridden M2 method");
    }
}
public class MethodUpcasting {
    public static void main(String[] args){
        Methods m = new ChildMethod();
        m.m1();                   // m1 method in parent class will be called
        m.m2();                   // overridden method in child class will be called
//        m.m3();                 // Not available because parent don't know if those methods even exists or not
    }
}
