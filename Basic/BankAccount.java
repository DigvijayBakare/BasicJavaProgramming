package TIllMay2024.Encapsulation;

// Printing the Bank details using Encapsulation

class Details{
    private String holderName, ifscCode, bankName, dob, upiAddress;
    private long phoneNo, accountNo, aTMNo;
    private int age, aTMPin, upiPin;
    private double debit, credit, accountBalance;
    private static int roll;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getUpiAddress() {
        return upiAddress;
    }

    public void setUpiAddress(String upiAddress) {
        this.upiAddress = upiAddress;
    }

    public long getaTMNo() {
        return aTMNo;
    }

    public void setaTMNo(long aTMNo) {
        this.aTMNo = aTMNo;
    }

    public int getaTMPin() {
        return aTMPin;
    }

    public void setaTMPin(int aTMPin) {
        this.aTMPin = aTMPin;
    }

    public int getUpiPin() {
        return upiPin;
    }

    public void setUpiPin(int upiPin) {
        this.upiPin = upiPin;
    }
}
public class BankAccount extends Details{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setHolderName("Arun Tiwari");
        ba.setAge(35);
        ba.setDob("15/08/1989");
        ba.setPhoneNo(9876543210L);
        ba.setBankName("State bank of India");
        ba.setAccountNo(98745632185L);
        ba.setIfscCode("SBOI458602");
        ba.setaTMNo(2541852196321L);
        ba.setaTMPin(4748);
        ba.setUpiAddress("9876543210@sbi");
        ba.setUpiPin(8520);
        ba.setDebit(10000.00);
        ba.setCredit(8000.00);
        ba.setAccountBalance(3000.00);
        System.out.println("Holder name: "+ba.getHolderName());
        System.out.println("Age: "+ba.getAge());
        System.out.println("DOB: "+ba.getDob());
        System.out.println("Ph. No: "+ ba.getPhoneNo());
        System.out.println("Bank name: "+ ba.getBankName());
        System.out.println("Account number: "+ ba.getAccountNo());
        System.out.println("IFSC code: "+ ba.getIfscCode());
        System.out.println("ATM No: "+ ba.getaTMNo());
        System.out.println("ATM pin: "+ ba.getaTMPin());
        System.out.println("UPI address: "+ ba.getUpiAddress());
        System.out.println("UPI pin: "+ ba.getUpiPin());
        System.out.println("Credited amount: "+ ba.getCredit()+" $");
        System.out.println("Debited amount: "+ ba.getDebit()+" $");
        System.out.println("Available balance: "+ ba.getAccountBalance()+" $");
    }
}
