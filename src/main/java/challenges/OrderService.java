package challenges;

import java.time.LocalDateTime;

interface OrderService {
    static boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        return true;
    }
}

