package Food2Door;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;

public class OrderRetriever {


    public OrderRequest retrieveExtraFoodShop() {

        User userExtraFoodShop = new User("Anna", "Nowak");
        Order orderExtraFoodShop = new Order("Honey", 15.10, 1);
        LocalDate dateExtraFoodShop = LocalDate.now();
        Companies company = new Companies("Extra Food Shop");


        return new OrderRequest (userExtraFoodShop, orderExtraFoodShop, dateExtraFoodShop, company);
    }

    public OrderRequest retrieveGlutenFreeShop() {

        User userGlutenFreeShop = new User("Kamil", "Nowak");
        Order orderGlutenFreeShop = new Order("Apple", 2.20, 1);
        LocalDate dateGlutenFreeShop = LocalDate.now();
        Companies company = new Companies("Gluten Free Shop");

        return new OrderRequest (userGlutenFreeShop, orderGlutenFreeShop, dateGlutenFreeShop, company);
    }

    public OrderRequest retrieveHealthyShop() {

        User userHealthyShop = new User("Maja", "Nowak");
        Order orderHealthyShop = new Order("Milk", 4.50, 1);
        LocalDate dateHealthyShop = LocalDate.now();
        Companies company = new Companies("Healthy Shop");

        return new OrderRequest (userHealthyShop, orderHealthyShop, dateHealthyShop, company);
    }
}
