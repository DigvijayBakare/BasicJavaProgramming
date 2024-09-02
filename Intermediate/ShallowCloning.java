package June2024.DurgaLearning;

class Cat {
    int j;
    Cat(int j) {
        this.j = j;
    }
}
class Dog implements Cloneable {
    Cat c;
    int i;
    Dog(Cat c, int i) {
        this.c = c;
        this.i = i;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c = new Cat(20);
        Dog d = new Dog(c,10);
        Dog d2 = (Dog) d.clone();                   // shallow cloning is done
        System.out.println("Before changing values: i = "+d.i+"\tj = "+d.c.j);
        d2.i = 100;
        d2.c.j = 200;
        System.out.println("Before cloning: i = "+d.i+"\tj = "+d.c.j);
        // here reference variable of d is changed because of shallow cloning
        System.out.println("After cloning: i = "+d2.i+"\tj = "+d2.c.j);
    }
}
