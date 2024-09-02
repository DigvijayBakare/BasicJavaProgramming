package SerializationInJava;

import java.io.*;

class Employee implements Serializable {
    private static final long serialUID = 123456L;
    transient int a;
    static int b;
    String name;
    int age;

    Employee(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
}
public class SerializationInJava {
    public static void printData (Employee e1) {
        System.out.println("name: "+e1.name);
        System.out.println("age: "+e1.age);
        System.out.println("a =  "+e1.a);
        System.out.println("b =  "+e1.b);
    }
    public static void main(String[] args) {
        Employee e = new Employee("Java",28,10,20);
        String fileName = "File.txt";
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(e);
            out.close();

            file.close();
            System.out.println("Object has been serialized");
            printData(e);
            e.b = 2000;
        } catch (IOException io) {
            System.out.println("IOException is caught");
        }
        e = null;
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            e = (Employee) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized\nData after deserialization:");
            printData(e);
        } catch (IOException io) {
            System.out.println("IOException caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException caught");
        }
    }
}
