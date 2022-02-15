import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Loan theLoan = new Loan();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        theLoan.setAnnualInterestRate(input.nextDouble());
        System.out.print("Enter numer of years as an integer: ");
        theLoan.setNumberOfYears(input.nextInt());
        System.out.print("Enter loan amount, for example, 120000.95:");
        theLoan.setLoanAmount(input.nextDouble());
        System.out.println("The loan was created on " + theLoan.loanDate);
        DecimalFormat twoDp = new DecimalFormat("0.00");
        System.out.println("THe monthly payment is " + twoDp.format(theLoan.getMonthlyPayment()));
        System.out.println("THe total payment is " + twoDp.format(theLoan.getTotalPayment(theLoan.getMonthlyPayment())));
    }
}

