package Food2Door;

import java.time.LocalDate;

public class ExtraFoodShop implements OrderRepository {
    @Override
    public boolean createOrder(User user, Order order, LocalDate time) {
        return true;
    }
}