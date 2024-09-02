package June2024.DurgaLearning;

class Cat1 {
    int j;
    Cat1(int j) {
        this.j = j;
    }
}
class Dog1 implements Cloneable {
    Cat1 c1;
    int i;
    Dog1(Cat1 c1, int i) {
        this.c1 = c1;
        this.i = i;
    }
    public Object clone() throws CloneNotSupportedException {
        Cat1 c3 = new Cat1(c1.j);
        Dog1 d3 = new Dog1(c3,i);
        return d3;
    }
}
public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat1 c1 = new Cat1(20);
        Dog1 d1 = new Dog1(c1,10);
        Dog1 d21 = (Dog1) d1.clone();                   // deep cloning is done
        System.out.println("Before changing values: i = "+d1.i+"\tj = "+d1.c1.j);
        d21.i = 100;
        d21.c1.j = 200;
        System.out.println("Before cloning: i = "+d1.i+"\tj = "+d1.c1.j);
        // here reference variable of d is changed because of shallow cloning
        System.out.println("After cloning: i = "+d21.i+"\tj = "+d21.c1.j);

    }


}
