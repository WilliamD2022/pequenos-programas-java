package br.com.william.entities;

public class SavingsAccout extends Account{

    public Double interestRate;

    public SavingsAccout() {
        super(0, "", 0.0);
    }

    public SavingsAccout(int number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        this.balance += this.balance * interestRate;
    }


    @Override
    public void withdraw (double amamount){
        balance -= amamount;
    }
}
