package TIllMay2024.Constructors;

class Testing{
    public Testing(){
        System.out.println("Testing method with no arguments");
    }
    public Testing(int a){
        System.out.println("Testing method with int argument");
    }
}
class Extending extends Testing{
    public Extending(){
        System.out.println("Extending method with no argument");
    }
    public Extending(int a){
        super(20);
        System.out.println("Extending method with int argument");
    }
}
public class ThisAndSuper extends Extending{
    public ThisAndSuper() {
        System.out.println("This and super without argument");
    }
    public ThisAndSuper(int a){
        //super(10);
        this();
        System.out.println("This and super with int argument");
    }

    public static void main(String[] args) {
        ThisAndSuper thisAndSuper = new ThisAndSuper(10);
    }
}
