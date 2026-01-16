package br.com.work.entities;

public class Individual extends TaxPayer {

    private double healthExpenditure;

    public Individual(String name, double anualIncome, double healthExpenditure) {
        super(name, anualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public double tax() {
        double basicTax = (getAnualIncome() < 20000.0)
            ? getAnualIncome() * 0.15
            : getAnualIncome() * 0.25;
        return basicTax - (getHealthExpenditure() * 0.5);
    }
}
