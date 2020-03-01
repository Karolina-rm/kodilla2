package Food2Door.Orders;

import java.time.LocalDate;

public class OrderRetriever {


    public OrderRequest retrieveExtraFoodShop() {

        User userExtraFoodShop = new User("Anna", "Nowak");
        Order orderExtraFoodShop = new Order("Honey", 15.10, 1);
        LocalDate dateExtraFoodShop = LocalDate.now();
        Company company = new Company(OrderCompanies.EXTRAFOODSHOP);


        return new OrderRequest (userExtraFoodShop, orderExtraFoodShop, dateExtraFoodShop, company);
    }

    public OrderRequest retrieveGlutenFreeShop() {

        User userGlutenFreeShop = new User("Kamil", "Nowak");
        Order orderGlutenFreeShop = new Order("Apple", 2.20, 1);
        LocalDate dateGlutenFreeShop = LocalDate.now();
        Company company = new Company(OrderCompanies.GLUTENFREESHOP);

        return new OrderRequest (userGlutenFreeShop, orderGlutenFreeShop, dateGlutenFreeShop, company);
    }

    public OrderRequest retrieveHealthyShop() {

        User userHealthyShop = new User("Maja", "Nowak");
        Order orderHealthyShop = new Order("Milk", 4.50, 1);
        LocalDate dateHealthyShop = LocalDate.now();
        Company company = new Company(OrderCompanies.HEALTHYSHOP);

        return new OrderRequest (userHealthyShop, orderHealthyShop, dateHealthyShop, company);
    }
}
