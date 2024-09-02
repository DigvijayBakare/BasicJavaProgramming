package June2024.DurgaLearning.ObjectClassMethods;

import java.lang.reflect.*;

public class GetClass {
    public static void main(String[] args) {
        Object o = new String("Java");
        Class c = o.getClass();
        System.out.println("Fully Qualified name: "+o.getClass());
        Method[] m = o.getClass().getDeclaredMethods();
        System.out.println("Methods information: ");
//        Connection con = DriverManager.getConnection();
//        System.out.println(con.getClass().getName());
        int count=0;
        for (Method m1 : m){
            System.out.println(m1.getName());
            count++;
        }
        System.out.println("The number of methods in "+c+" is " +count);
    }
}
