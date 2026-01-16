package br.com.exemplosinterface.model.entities;

public class Vehiicle {

    private String model;

    public Vehiicle() {
    }

    public Vehiicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
