package Entities;

import Entities.Enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Iterable<Product> items;
    private Client client;

    public Order() {
    }

    public Order(Client client, Iterable<Product> items, Date moment, OrderStatus status) {
        this.client = client;
        this.items = items;
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Double total() {
        Double sum = 0.0;
        for (Product p : items) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:");
        sb.append("\nOrder moment: ");
        sb.append(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(moment));
        sb.append("\nOrder Status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client.getName()).append(" ");
        sb.append("(").append(new SimpleDateFormat("dd/MM/yyyy").format(client.getBirthDate())).append(")");
        sb.append(" - ");
        sb.append(client.getEmail());
        sb.append("\nOrder items: ");
        sb.append("\n");

        for (Product p : items) {
            sb.append(p).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}
