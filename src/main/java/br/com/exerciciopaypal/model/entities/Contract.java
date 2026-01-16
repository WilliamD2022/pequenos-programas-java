package br.com.exerciciopaypal.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private double number;

    private LocalDate date;

    private double totalValue;
    private List<Installment> installments = new ArrayList<>();

    public Contract() {
    }

    public Contract(double number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }


    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }

    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", date=" + date +
                ", totalValue=" + totalValue +
                '}';
    }



}
