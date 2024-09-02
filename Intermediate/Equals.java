package June2024.DurgaLearning.ObjectClassMethods;

public class Equals {
    String name;
    int roll;
    Equals(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    /*@Override
    public boolean equals(Object obj) {
        try {
            String name1 = this.name;
            int roll1 = this.roll;

            Equals e = (Equals) obj;
            String name2 = e.name;
            int roll2 = e.roll;
            if (name1.equals(name2) && roll1 == roll2) {
                return true;
            } else return false;
        }catch (ClassCastException e){return false;}
        catch (NullPointerException e){return false;}
    }*/
    /*@Override
    public boolean equals(Object obj) {                 // this is the simplified version of equals() method
        try {
            Equals e = (Equals) obj;
            if (name.equals(e.name) && roll == e.roll) {
                return true;
            } else return false;
        }catch (ClassCastException e){return false;}
        catch (NullPointerException e){return false;}
    }*/
    @Override
    public boolean equals(Object obj) {                 // this is the more simplified version of equals() method
        if (obj == this) return true;
        if (obj instanceof Equals){
            Equals e = (Equals) obj;
            if (name.equals(e.name) && roll == e.roll) {
                return true;
            } else return false;
        }return false;
    }

    public static void main(String[] args) {
        Equals e = new Equals("Arun",101);
        Equals e1 = new Equals("Ravi",102);
        Equals e4 = new Equals("Arun",101);
        Equals e3 = e;

        System.out.println(e.equals(e1));       // false
        System.out.println(e1.equals(e3));      // false
        System.out.println(e.equals(e3));       // true
        System.out.println(e.equals(e4));       // false, because objects are different
        System.out.println(e.equals("Arun"));   // object to string casting is there so error CCE error will be there
        // so we'll put it in try catch block
        System.out.println(e.equals(null));
    }
}
