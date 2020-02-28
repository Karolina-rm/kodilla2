package Food2Door;

import java.time.LocalDate;

interface OrderService {

    static boolean order(User user, Order order, LocalDate time, Companies companyName) {
        return true;
    }
}
