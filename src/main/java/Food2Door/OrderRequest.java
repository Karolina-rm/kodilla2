package Food2Door;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private Order order;
    private LocalDate orderDate;
    private Companies companyName;

    public OrderRequest (User user, Order order, LocalDate orderDate, Companies companyName) {

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

    public Companies getCompanyName() {
        return companyName;
    }
}
