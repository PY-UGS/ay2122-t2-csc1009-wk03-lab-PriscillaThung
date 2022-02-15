import java.lang.Math;

public class Loan{
    double annualInterestRate;
    int numberOfYears;
    double loanAmount;
    java.util.Date loanDate;

    public Loan (){
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new java.util.Date();

    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public int getNumberOfYears()
    {
        return numberOfYears;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    public java.util.Date getLoanDate()
    {
        return loanDate;
    }

    public void setAnnualInterestRate(double interestRate)
    {
        annualInterestRate = interestRate;
    }

    public void setNumberOfYears(int years)
    {
        numberOfYears = years;
    }

    public void setLoanAmount(double amount)
    {
        loanAmount = amount;
    }

    public double getMonthlyPayment()
    {
        double monthlyInterestRate = annualInterestRate / 12 /100;
        double monthlyPayment = (loanAmount * monthlyInterestRate)/(1-(1/Math.pow((1+monthlyInterestRate),(numberOfYears *12) )));
        return monthlyPayment;
    }

    public double getTotalPayment(double monthlyPayment)
    {
        double totalPayment = monthlyPayment * numberOfYears * 12;
        return totalPayment;
    }
}