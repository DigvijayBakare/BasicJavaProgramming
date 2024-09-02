package Collection.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileInputStream fi = new FileInputStream("D:\\Coding\\JAVA\\Codes\\July2024\\src\\Collection\\abc.properties");
//        FileInputStream fi = new FileInputStream("D:\\Coding\\JAVA\\Codes\\July2024\\src\\Collection\\mno.txt");
        p.load(fi);
        System.out.println("Data in properties file abc: "+p);
        String s = p.getProperty("venki");
        System.out.println("Property associated with venki: "+s);
        p.setProperty("nag","88888");
        FileOutputStream fo = new FileOutputStream("D:\\Coding\\JAVA\\Codes\\July2024\\src\\Collection\\abc.properties");
//        FileOutputStream fo = new FileOutputStream("D:\\Coding\\JAVA\\Codes\\July2024\\src\\Collection\\mno.txt");
        p.store(fo,"Updated by Digvijay");
    }
}
