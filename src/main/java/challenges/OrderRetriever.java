package challenges;

import java.time.LocalDateTime;


public class OrderRetriever {


    public OrderRequest retrive() {

        User user = new User("Anna", "Nowak");
        LocalDateTime ordertime = LocalDateTime.of(2020, 2, 25, 12, 20);
        Product product = new Product("toys", "sandbox");
        int quantity = 1;

        return new OrderRequest(user, ordertime, product, quantity);
    }
}
