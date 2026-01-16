package br.com.william.entities;

public class BusinessAcount extends Account {

    private double loanLimit;

   public BusinessAcount() {
       super(0, "", 0.0);

   }

    public BusinessAcount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
       if (amount <= loanLimit){
           balance += amount - 10.0;
       }

    }

    @Override
    public void withdraw (double amamount){
        super.withdraw(amamount);
        balance -= 2.0;
    }
}
