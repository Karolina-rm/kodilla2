package challenges;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class OrderDTO {

    private User user;
    private LocalDateTime orderTime;
    private Product product;
    private int quantity;
    private boolean isSold;

    public OrderDTO(final User user, final LocalDateTime orderTime, Product product, int quantity, boolean isSold) {
        this.user = user;
        this.orderTime = orderTime;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSold() {
        return isSold;
    }
}
