package SerializationInJava;
import java.io.*;
import java.util.SortedMap;


class Demo implements Serializable {
    public int a;
    public String b;

    // default constructor
    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
public class JavaSerialization {
    public static void main(String[] args) {
        Demo d = new Demo(1,"Java");
        String filename = "file.ser";

        // serialization
        try {
            // saving of object in a file
            FileOutputStream fs = new FileOutputStream(filename);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            // method for serialization of object
            os.writeObject(d);
            os.close();
            fs.close();
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            System.out.println("IOException caught: "+e.getMessage());
        }

        Demo obj = null;

        // Deserialization
        try {
            // reading the object from the file
            FileInputStream fi = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fi);

            // method for deserialization of object
            obj = (Demo)oi.readObject();
            oi.close();
            fi.close();

            System.out.println("Object has been deserialized");
            System.out.println("a = "+obj.a);
            System.out.println("b = "+obj.b);
        } catch (IOException e) {
            System.out.println("IOException caught: "+e.getMessage());
        } catch (ClassNotFoundException c) {
            System.out.println("ClassNotFoundException caught: "+c.getMessage());
        }
    }
}
