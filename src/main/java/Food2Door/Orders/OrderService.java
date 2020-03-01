package Food2Door.Orders;

import java.time.LocalDate;

interface OrderService {

    static boolean order(User user, Order order, LocalDate time, Company companyName) {
        return true;
    }
}
