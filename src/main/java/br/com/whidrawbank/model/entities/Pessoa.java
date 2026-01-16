package br.com.whidrawbank.model.entities;


public class Pessoa {

    private long number;

    private String nameHolder;

    public Pessoa(long number, String nameHolder) {
        this.number = number;
        this.nameHolder = nameHolder;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "number=" + number +
                ", nameHolder='" + nameHolder + '\'' +
                '}';
    }
}
