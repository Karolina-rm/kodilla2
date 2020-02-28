package challenges;

import java.time.LocalDateTime;


public class SandboxOrder implements OrderService {

    public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        return true;
    }

}
