
/* Program for Lion,Tiger and horse about their behaviour using abstract class as animal and abstract methods as
    eat(), sleep() and sound().*/

abstract class Animal{
    abstract void sound();
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{
    @Override
    void sound() {
        System.out.println("Lion roars.");
    }
    @Override
    void eat() {
        System.out.println("Lion gets food by hunting other animals.");
    }
    @Override
    void sleep() {
        System.out.println("Has a cave as home.");
    }
}
class Tiger extends Animal{
    @Override
    void sound() {
        System.out.println("Tiger roars.");
    }
    @Override
    void eat() {
        System.out.println("Eats meat of another animal by hunting them.");
    }
    @Override
    void sleep() {
        System.out.println("Sleeps around trees.");
    }
}
class Horse extends Animal{
    @Override
    void sound() {
        System.out.println("Horse sounds like Hihhhihi.");
    }
    @Override
    void eat() {
        System.out.println("Eats grass");
    }
    @Override
    void sleep() {
        System.out.println("Sleeps in tabela.");
    }
}
public class AnimalInfo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
        lion.eat();
        lion.sleep();
    }
}
