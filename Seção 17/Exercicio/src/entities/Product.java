package entities;

public class Product {
    
    private String name;
    private Double unitPrice;
    private Integer quantity;

    public Product(String name, Double unitPrice, Integer quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getunitPrice(){
        return unitPrice;
    }

    public void setunitPrice(Double unitPrice){
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public double totalPrice(){
        return unitPrice * quantity;
    }

    @Override
    public String toString(){
        return name + "," + String.format("%.2f", totalPrice());
    }
}