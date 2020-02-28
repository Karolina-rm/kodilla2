package Food2Door;

import java.time.LocalDate;

public class GlutenFreeShop implements OrderRepository {
    @Override
    public boolean createOrder(User user, Order order, LocalDate time) {
        return true;
    }
}
