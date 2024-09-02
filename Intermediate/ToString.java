package June2024.DurgaLearning.ObjectClassMethods;

public class ToString {
    String name;
    int roll;
    ToString(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name+"  "+roll;
    }
/*@Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toString(hashCode());
    }*/

    public static void main(String[] args) {
        ToString ts = new ToString("Arun",101);
        ToString ts1 = new ToString("Shree",102);
        System.out.println(ts);                     // o/p: June2024.DurgaLearning.ObjectClassMethods.ToString@7b23ec81
        // object class methods toString() method executed
        /*public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/
        System.out.println(ts.toString());          // o/p: June2024.DurgaLearning.ObjectClassMethods.ToString@7b23ec81
        System.out.println(ts1);
    }
}
