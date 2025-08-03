package Entities;

public class OrderItem {

    private final Double price;
    private final Integer quantity;

    public OrderItem(Double price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getSubtotal() {
        return price * quantity;
    }

}
