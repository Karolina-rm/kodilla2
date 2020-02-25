package challenges;

import java.time.LocalDateTime;

public class SandboxRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime orderTime, Product product, int quantity) {
        return true;
    }
}
