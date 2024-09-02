package TIllMay2024.Practice.Examples;


import java.util.Scanner;

public class SIPAndEmiCalci {
    public static void monthsRequired() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the final amount you want: ");
        double fv = sc.nextDouble();
        System.out.print("Enter the monthly amount you want to deposit: ");
        double pv = sc.nextDouble();
        System.out.print("Enter the interest rate given by bank: ");
        double ir = sc.nextDouble();
        double c = 1;                                  // compound frequency
        double n;                                       // months required

        n = (Math.log(fv))/(c*pv*(1+((ir/100)/c)));
        System.out.println("Required months for accumulating final required amount: "+n);
        double year = n/12;
        System.out.println("Years = "+year);
    }
    public static void futureValue(){                               // This calculate future return value on fixed deposit
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the present amount you want: ");
        double pv = sc.nextDouble();
        System.out.print("Enter the interest rate given by bank: ");
        double ir = sc.nextDouble();                    // yearly interest rate
        ir = ir/100;
        double c = 1;                                  // compound frequency
        double n = 9;                                       // years required

        double fv = pv*(Math.pow((1+(ir/c)),(n*c)));
        System.out.println("Future value will be: "+fv);
    }
    public static void SIP(){                           // SIP calculation on monthly deposit
        int monthlyAmount = 10000;
        double ir = 0.12/12;                            // interest per month
        double n = 70, amount = 0;                      // no of years
        for (int i=0; i<=n; i++){
            amount = monthlyAmount+amount+(amount*ir);
            System.out.println(i+" month "+amount);
        }
        System.out.println("After "+n+" months your amount = "+(amount-monthlyAmount));
    }
    public static void nOfMonth(){                      // no of months required to collect required emergency fund
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target amount:");
        double targetAmount = sc.nextDouble();
        System.out.print("Enter your monthly deposit amount: ");
        double monthlyContribution = sc.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = sc.nextDouble();
        double currentBalance = 0;
        int months = 0;

        while (currentBalance < targetAmount) {
            double monthlyInterest = (currentBalance * (annualInterestRate / 12));
            currentBalance += monthlyContribution + monthlyInterest;
            months++;
        }
        int year = months/12;
        int mon = months%12;
        System.out.println("It will take " + months + " months to collect an emergency fund of " + targetAmount + " with a monthly SIP of " + monthlyContribution + " and an annual interest rate of " + (annualInterestRate * 100) + "%.");
        System.out.println("That is "+year+" years "+mon+" months");
    }
    public static void main(String[] args) {
//        monthsRequired();
//        futureValue();
        SIP();
//        nOfMonth();
    }
}
