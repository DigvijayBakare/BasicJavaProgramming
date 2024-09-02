package TIllMay2024.Polymorphism.MethodOverriding.Casting;
// Write a code for showing how the upcasting works

class UpParent{
    void display(){                                     // Method declared in a parent class
        System.out.println("This is parent class");
    }
    void show(){
        System.out.println("This is show method in parent class");
    }
    static void snow(){
        System.out.println("static method");
    }
}

public class Upcasting extends UpParent{             // Casting is a part of overriding, so we'll need parent-child relation in class
    @Override
    void display() {
        System.out.println("Method in child");
    }
    void asd(){                                     // This method will not be accessible by upcasting because this method is not available in parent class
        System.out.println("Method 1");
    }
    public static void main(String[] args){
        UpParent up = new Upcasting();          // Upcasting is done
// We have created an object of a child class, so it will call all the methods in child class including that which are not overridden
        up.display();
        up.show();
//        up.asd();                         // will not work
        up.snow();                          // static method can be accessed directly so no need of object
// The method call depends on the which object type we have written or called during object creation
    }
}
