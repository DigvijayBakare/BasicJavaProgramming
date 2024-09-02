package June2024.DurgaLearning;

public class CloneNotSupportedExceptionHandling implements Cloneable {
    int a = 10, b = 20;
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneNotSupportedExceptionHandling cn = new CloneNotSupportedExceptionHandling();

        CloneNotSupportedExceptionHandling cn1 = (CloneNotSupportedExceptionHandling) cn.clone();
        cn1.a = 100;
        cn1.b = 200;
        System.out.println("Before cloning: "+cn.a+" & "+cn.b);
        System.out.println("After cloning: "+cn1.a+" & "+cn1.b);
    }
}
