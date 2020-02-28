package challenges;

import java.time.LocalDateTime;

interface OrderRepository {
    public boolean createOrder(User user, LocalDateTime orderTime, Product product, int quantity);

}
