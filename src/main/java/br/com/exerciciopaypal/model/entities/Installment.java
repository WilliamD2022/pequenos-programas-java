package br.com.exerciciopaypal.model.entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate dueDate;
    private double amount;
    private int  numberPayment;

    public Installment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.numberPayment++;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
