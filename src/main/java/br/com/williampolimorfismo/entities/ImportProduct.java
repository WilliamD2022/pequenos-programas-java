package br.com.williampolimorfismo.entities;

public class ImportProduct extends Product{

    private Double coustomFee;

    public ImportProduct(String name, double price, Double coustomFee) {
        super(name, price);
        this.coustomFee = coustomFee;
    }

    public Double getCoustomFee() {
        return coustomFee;
    }

    public void setCoustomFee(Double coustomFee) {
        this.coustomFee = coustomFee;
    }

    public Double totalPrice(){
        return getPrice() + coustomFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", coustomFee)
                + ")";
    }
}
