package Food2Door.Shops;

import Food2Door.Orders.Order;
import Food2Door.Orders.OrderRepository;
import Food2Door.Orders.User;

import java.time.LocalDate;

public class HealthyShop implements OrderRepository {
    @Override
    public boolean createOrder(User user, Order order, LocalDate time) {
        return true;
    }
}