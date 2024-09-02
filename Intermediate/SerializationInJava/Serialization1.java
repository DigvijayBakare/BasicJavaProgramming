package SerializationInJava;

import java.io.*;

class Dog implements Serializable {
    int i = 10;
//    int j = 20;
    transient int j = 20;
//    transient static int j = 20;
//    transient final int j = 20;
// use transient when we don't want to save that variable in a serialised file, but if we make a variable final
// or static and then tried to use it will appear as it is in our object (i.e. we'll be able to use the original value)

}
public class Serialization1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1 = new Dog();
        System.out.println("Serialization started");
        FileOutputStream fo = new FileOutputStream("abc.ser");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(d1);
        System.out.println("Serialization ended");


        /*System.out.println("Deserialization started");
        FileInputStream fio = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fio);
        Dog d2 = (Dog) ois.readObject();
        oo.writeObject(d1);
        System.out.println("Deserialization ended");
        System.out.println("Dog object data");
        // final result
        System.out.println(d2.i+"\t"+d2.j);*/
    }
}
