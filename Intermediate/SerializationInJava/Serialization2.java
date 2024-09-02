package SerializationInJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Deserialization started");
        FileInputStream fio = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fio);
        Dog d2 = (Dog) ois.readObject();

        System.out.println("Deserialization ended");
        System.out.println("Dog object data");
        // final result
        System.out.println(d2.i+"\t"+d2.j);
    }
}
