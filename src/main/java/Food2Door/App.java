package Food2Door;

public class App {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieveExtraFoodShop();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ExtraFoodShop());
        orderProcessor.process(orderRequest);
    }
}

