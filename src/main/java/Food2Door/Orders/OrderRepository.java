package Food2Door.Orders;

import Food2Door.Orders.Order;
import Food2Door.Orders.User;

import java.time.LocalDate;

public interface OrderRepository {

    boolean createOrder(User user, Order order, LocalDate time);
}
