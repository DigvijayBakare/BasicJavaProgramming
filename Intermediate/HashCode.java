package June2024.DurgaLearning.ObjectClassMethods;

public class HashCode {
    // override object class hashCode method

    int i;
    HashCode(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return i+" ";
    }

    @Override
    public int hashCode() {
        return i;
    }
    public static void main(String[] args) {
        HashCode hc = new HashCode(10);
        HashCode hc1 = new HashCode(100);
        int a = 500;
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");     //  creates new object every time
        String s4 = new String("Java1");

        System.out.println("S1 == s2 "+(s1==s2));   // true
        System.out.println("S1 == s3 "+(s1==s3));   // false
        System.out.println("S1 == s4 "+(s1==s4));   // false

        // but for every similar object we'll get same hash code
        System.out.println("Hash code of a  : "+Integer.hashCode(a));
        System.out.println("Hash of i : "+hc);
        System.out.println("Hash of i : "+hc1);
        System.out.println("Hash code of s1 : "+s1.hashCode());
        System.out.println("Hash code of s2 : "+s2.hashCode());
        System.out.println("Hash code of s3 : "+s3.hashCode());
        System.out.println("Hash code of s4 : "+hc.hashCode());     // different object gets different hashCode
        System.out.println("Hash code of a  : "+Integer.hashCode(a));
        System.out.println("Hash of i : "+hc);
        System.out.println("Hash of i : "+hc1);
    }
}
