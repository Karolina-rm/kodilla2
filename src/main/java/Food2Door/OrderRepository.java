package Food2Door;

import java.time.LocalDate;

public interface OrderRepository {

    boolean createOrder(User user, Order order, LocalDate time);
}
