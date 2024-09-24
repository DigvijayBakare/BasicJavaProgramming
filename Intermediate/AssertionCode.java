public class AssertionCode {
    /*boolean approveTicket(int age) {
        if (age > 60) return true;
        else return false;
    }*/ // => This is a normal method and can cause problems in the future.

    boolean approveTicket(int age) {
//        assert (age >60 && age < 100);
        assert (age > 60 && age < 100) : "Age entered is " + age;
        if (age > 60) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        AssertionCode ac = new AssertionCode();
	int age = 130;
	if (ac.approveTicket(age)) {
        System.out.println("Ticket has been approved for the age: " + age);
	}
    }
}
