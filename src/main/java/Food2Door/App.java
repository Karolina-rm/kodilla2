package Food2Door;

import Food2Door.Services.MailService;
import Food2Door.Orders.OrderProcessor;
import Food2Door.Orders.OrderRequest;
import Food2Door.Orders.OrderRetriever;
import Food2Door.Shops.ExtraFoodShop;

public class App {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieveExtraFoodShop();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ExtraFoodShop());
        orderProcessor.process(orderRequest);
    }
}

