package Food2Door.Orders;


import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private Order order;
    private LocalDate orderDate;
    private Company companyName;

    public OrderRequest (User user, Order order, LocalDate orderDate, Company companyName) {

        this.user = user;
        this.order = order;
        this.orderDate = orderDate;
        this.companyName = companyName;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Company getCompanyName() {
        return companyName;
    }
}
