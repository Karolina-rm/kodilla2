package challenges;

import java.time.LocalDateTime;


public class OrderRequest {

    private User user;
    private LocalDateTime orderTime;
    private Product product;
    private int quantity;

    public OrderRequest(final User user, final LocalDateTime orderTime, final Product product, int quantity) {
        this.user = user;
        this.orderTime = orderTime;
        this.product = product;
        this.quantity = quantity;
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
}
